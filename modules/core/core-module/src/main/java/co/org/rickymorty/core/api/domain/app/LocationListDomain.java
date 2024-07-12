package co.org.rickymorty.core.api.domain.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import co.org.rickymorty.core.application.entity.messenger.locationDomain;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationListDomain {

     private List<locationDomain> locationList;
}
