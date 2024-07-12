
package co.org.rickymorty.core.api.manager;

import co.org.rickymorty.core.api.events.RequestEvent;
import co.org.rickymorty.core.api.events.ResponseEvent;
import co.org.rickymorty.core.application.page.EntityPage;

import java.io.Serializable;
import java.util.Collection;


public interface EventManager<E extends Serializable> {

  /**
   * @param requestEvent
   * @return
   */
  ResponseEvent<E> create(RequestEvent<E> requestEvent);

  /**
   * @param requestEvent
   * @return
   */
  ResponseEvent<E> read(RequestEvent<E> requestEvent);

  /**
   * @param requestEvent
   * @return
   */
  ResponseEvent<Collection<E>> search(RequestEvent<E> requestEvent);

  /**
   * @param requestEvent
   * @return
   */
  ResponseEvent<EntityPage<E>> pagedSearch(RequestEvent<E> requestEvent);

  /**
   * @param requestEvent
   * @return
   */
  ResponseEvent<E> validate(RequestEvent<E> requestEvent);

  /**
   * @param requestEvent
   * @return
   */
  ResponseEvent<E> update(RequestEvent<E> requestEvent);

  /**
   * @param requestEvent
   * @return
   */
  ResponseEvent<E> delete(RequestEvent<E> requestEvent);

}
