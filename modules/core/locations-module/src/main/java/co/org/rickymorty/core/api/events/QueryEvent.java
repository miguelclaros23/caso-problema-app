
package co.org.rickymorty.core.api.events;

import com.google.gson.Gson;
import java.util.Map;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class QueryEvent {

  private Map<String, String> filters;

  QueryEvent(Map<String, String> filters) {
    this.filters = filters;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
