
package co.org.rickymorty.core.application.executor;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class AfterCommitExecutor extends TransactionSynchronizationAdapter implements CommandExecutor {

  private static final Logger LOG = LoggerFactory.getLogger(AfterCommitExecutor.class);
  private static final ThreadLocal<List<Runnable>> RUNNABLES = new ThreadLocal<>();

  @Override
  public void execute(Runnable runnable) {
    LOG.debug("Submitting new runnable {} to run after commit", runnable);
    if (!TransactionSynchronizationManager.isSynchronizationActive()) {
      LOG.debug("Transaction synchronization is NOT ACTIVE. Executing right now runnable {}", runnable);
      runnable.run();
      return;
    }
    List<Runnable> threadRunnables = RUNNABLES.get();
    if (threadRunnables == null) {
      threadRunnables = new ArrayList<>();
      RUNNABLES.set(threadRunnables);
      TransactionSynchronizationManager.registerSynchronization(this);
    }
    threadRunnables.add(runnable);
  }

  @Override
  public void afterCommit() {
    List<Runnable> threadRunnables = RUNNABLES.get();
    LOG.debug("Transaction successfully committed, executing {} runnables", threadRunnables.size());
    for (int i = 0; i < threadRunnables.size(); i++) {
      Runnable runnable = threadRunnables.get(i);
      LOG.debug("Executing runnable {}", runnable);
      try {
        runnable.run();
      } catch (RuntimeException e) {
        LOG.error("Failed to execute runnable " + runnable, e);
      }
    }
  }

  @Override
  public void afterCompletion(int status) {
    LOG.debug("Transaction completed with status {}", status == STATUS_COMMITTED ? "COMMITTED" : "ROLLED_BACK");
    RUNNABLES.remove();
  }
}
