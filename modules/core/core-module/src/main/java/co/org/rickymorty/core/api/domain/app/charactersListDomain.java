package co.org.rickymorty.core.api.domain.app;


import co.org.rickymorty.core.application.entity.messenger.locationDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class charactersListDomain {

     private List<charactersDomain> charactersList;

}
