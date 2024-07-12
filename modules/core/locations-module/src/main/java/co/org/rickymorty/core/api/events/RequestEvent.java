package co.org.rickymorty.core.api.events;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Map;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class RequestEvent<E extends Serializable> {

  private Object id;
  private E object;
  private Map<String, String> filters;

  RequestEvent(Object id, E object, Map<String, String> filters) {
    this.id = id;
    this.object = object;
    this.filters = filters;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }

}
