
package co.org.rickymorty.core.api.events;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class CommandEvent<E> {

  private E request;

  CommandEvent(E request) {
    this.request = request;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
