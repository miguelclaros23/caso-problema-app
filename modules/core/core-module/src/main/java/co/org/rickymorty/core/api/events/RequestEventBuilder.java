
package co.org.rickymorty.core.api.events;

import java.io.Serializable;
import java.util.Map;

public class RequestEventBuilder<E extends Serializable> {

  private Object id;
  private E object;
  private Map<String, String> filters;

  public RequestEventBuilder() {
    super();
  }

  public RequestEventBuilder<E> id(Object id) {
    this.id = id;
    return this;
  }

  public RequestEventBuilder<E> object(E object) {
    this.object = object;
    return this;
  }

  public RequestEventBuilder<E> filters(Map<String, String> filters) {
    this.filters = filters;
    return this;
  }

  public RequestEvent<E> build() {
    return new RequestEvent<>(id, object, filters);
  }
}
