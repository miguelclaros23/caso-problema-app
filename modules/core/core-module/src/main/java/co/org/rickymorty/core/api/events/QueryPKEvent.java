
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
public class QueryPKEvent<E extends Serializable> {

  private E request;
  private Map<String, String> filters;

  QueryPKEvent(E request, Map<String, String> filters) {
    this.request = request;
    this.filters = filters;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
