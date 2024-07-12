
package co.org.rickymorty.core.application.exception;

/**
 * [description]
 *
 * @author: Diego Poveda <diego.poveda@ricky-morty.com>
 * @version 3.0-SNAPSHOT
 * @since: 1.8
 */
public class PersistenceException extends Exception {

  private static final long serialVersionUID = 1L;

  /**
   *
   */
  public PersistenceException() {
    super();
  }

  /**
   *
   * @param message
   */
  public PersistenceException(String message) {
    super(message);
  }

  /**
   *
   * @param cause
   */
  public PersistenceException(Throwable cause) {
    super(cause);
  }

  /**
   *
   * @param message
   * @param cause
   */
  public PersistenceException(String message, Throwable cause) {
    super(message, cause);
  }

}
