
package co.org.rickymorty.core.application.entity.configuration;

import com.google.gson.Gson;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(schema = "DELIVERY", name = "DELIVERY_PROPERTY")
@Data
@SuppressWarnings("PersistenceUnitPresent")
public class DeliveryProperty implements Serializable {

  private static final long serialVersionUID = -2260120720195500309L;

  @Id
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 100)
  @Column(name = "KEYY")
  private String keyy;

  @Basic(optional = false)
  @NotNull
  @Column(name = "VALUEE")
  private String valuee;

  @Size(max = 200)
  @Column(name = "DESCRIPTION")
  private String description;

  @Basic(optional = false)
  @NotNull
  @Column(name = "ACTIVE")
  private Boolean active;

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }

}
