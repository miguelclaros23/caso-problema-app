
package co.org.rickymorty.core.api.domain.generic;

import com.google.gson.Gson;
import lombok.Data;

import java.io.Serializable;


@Data
public class GenericResponseDomain implements Serializable {

  private static final long serialVersionUID = -3501295279055998630L;

  private String message;

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }

}
