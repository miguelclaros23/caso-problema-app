package co.org.rickymorty.core.api.manager.app;

import co.org.rickymorty.core.api.domain.app.LocationListDomain;
import co.org.rickymorty.core.api.domain.app.charactersListDomain;
import co.org.rickymorty.core.api.events.ResponseEvent;
import co.org.rickymorty.core.application.entity.messenger.characterDomain;
import co.org.rickymorty.core.application.entity.messenger.locationDomain;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


public interface appManager {

    void migrateData( @Param("type") String type);

    ResponseEvent<characterDomain> updateCharacter(@PathVariable("characterId") Long characterId, @RequestBody characterDomain charactersRequest);

    ResponseEvent<charactersListDomain> allCharacter();

    ResponseEvent<characterDomain> getCharacter( @PathVariable("characterId") Long characterId);

    ResponseEvent<characterDomain> deleteCharacter( @PathVariable("characterId") Long characterId);

    ResponseEvent<LocationListDomain> allLocation();

    public ResponseEvent<locationDomain> updateLocation(Long locationId, locationDomain locationUpdate);

    ResponseEvent<locationDomain> getLocation(@PathVariable("locationId") Long locationId);

    ResponseEvent<locationDomain> deleteLocation( @PathVariable("locationId") Long locationId);


}
