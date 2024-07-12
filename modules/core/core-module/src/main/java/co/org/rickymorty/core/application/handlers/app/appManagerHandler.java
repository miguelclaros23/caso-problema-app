package co.org.rickymorty.core.application.handlers.app;

import co.org.rickymorty.core.api.domain.app.LocationListDomain;
import co.org.rickymorty.core.api.domain.app.charactersDomain;
import co.org.rickymorty.core.api.domain.app.charactersListDomain;
import co.org.rickymorty.core.api.domain.app.request.locationRequest;
import co.org.rickymorty.core.api.domain.app.request.locationUpdateRequest;
import co.org.rickymorty.core.api.events.ResponseEvent;
import co.org.rickymorty.core.api.manager.app.appManager;
import co.org.rickymorty.core.application.entity.messenger.characterDomain;
import co.org.rickymorty.core.application.entity.messenger.locationDomain;
import co.org.rickymorty.core.application.repository.messenger.CharacterRepository;
import co.org.rickymorty.core.application.repository.messenger.LocationRepository;
import co.org.rickymorty.core.application.services.app.rickAndMortyManagerMicroserviceImpl;;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import java.lang.reflect.Type;
import java.util.List;

@Service
@Slf4j
public class appManagerHandler implements appManager {

    private static final Gson GSON = new Gson();


    @Autowired
    rickAndMortyManagerMicroserviceImpl rickAndMortyManagerMicroservice;


    @Autowired
    CharacterRepository characterRepository;

    @Autowired
    LocationRepository locationRepository;

    /**
     * @param type
     * @return
     */
    @Override
    public void migrateData(String type) {

        switch (type){
            case "character":
                Response<JsonObject> responseCharacter = rickAndMortyManagerMicroservice.getAllCharacter();
                break;

            case "location":
                Response<JsonObject> responseLocation = rickAndMortyManagerMicroservice.getAllLocation();
                break;
        }

    }


    /**
     * @param characterId
     * @param charactersRequest
     * @return
     */
    @Override
    public ResponseEvent<characterDomain> updateCharacter(Long characterId, characterDomain charactersRequest) {

        characterDomain character = characterRepository.findById(characterId).orElse(null);
        if ( character == null ) {
            characterRepository.save(charactersRequest );
            return new ResponseEvent<characterDomain>().ok("Created",charactersRequest);

        }else{
            characterDomain characterUpdate = new characterDomain();
            characterUpdate.setName( charactersRequest.getName());
            characterUpdate.setGender( charactersRequest.getGender());
            characterUpdate.setStatus( charactersRequest.getStatus() );
            characterRepository.save(charactersRequest );
            return new ResponseEvent<characterDomain>().ok("Update ",charactersRequest);
        }
    }

    /**
     * @return
     */
    @Override
    public ResponseEvent<charactersListDomain> allCharacter() {

        charactersListDomain charactersListDomain = new charactersListDomain( );
        List<characterDomain> charactersDomain = characterRepository.findAll();
        ResponseEvent<charactersListDomain> responseEvent = new ResponseEvent<charactersListDomain>().ok("Success");
        responseEvent.setData(charactersListDomain);
        return responseEvent;
    }

    /**
     * @param characterId
     * @return
     */
    @Override
    public ResponseEvent<characterDomain> getCharacter(Long characterId) {

        characterDomain character = characterRepository.findById(characterId).orElse(null);
        ResponseEvent<characterDomain> responseEvent = new ResponseEvent<characterDomain>().ok("Success");
        responseEvent.setData( character );
        return  responseEvent;
    }

    /**
     * @param characterId
     * @return
     */
    @Override
    public ResponseEvent<characterDomain> deleteCharacter(Long characterId) {

        characterDomain character = characterRepository.findById(characterId).orElse(null);
        if( character == null){
            ResponseEvent<characterDomain> responseEvent = new ResponseEvent<characterDomain>().ok("Failed");
        }
        characterRepository.delete(character );
        return new ResponseEvent<characterDomain>().ok("Deleted",character);
    }

    /**
     * @return
     */
    @Override
    public ResponseEvent<LocationListDomain> allLocation() {

        LocationListDomain locationListDomain = new LocationListDomain( );
        List<locationDomain> locationDomains = locationRepository.findAll();
        locationListDomain.setLocationList(locationDomains);
        ResponseEvent<LocationListDomain> responseEvent = new ResponseEvent<LocationListDomain>().ok("Success");
        responseEvent.setData(locationListDomain);
        return responseEvent;
    }


    /**
     * @param locationId
     * @return
     */
    @Override
    public ResponseEvent<locationDomain> updateLocation(Long locationId, locationDomain locationUpdate) {
        locationDomain location = locationRepository.findById(locationId).orElse(null);
        if ( location == null ) {
            locationRepository.save(location );
            return new ResponseEvent<locationDomain>().ok("Created",locationUpdate);

        }else{
            locationDomain locationCreate = new locationDomain();
            locationCreate.setDimension( locationUpdate.getDimension());
            locationCreate.setType( locationUpdate.getType());
            locationRepository.save(locationUpdate );
            return new ResponseEvent<locationDomain>().ok("Update ",location);
        }
    }

    /**
     * @param locationId
     * @return
     */
    @Override
    public ResponseEvent<locationDomain> getLocation(Long locationId) {

        locationDomain locationDomain = locationRepository.findById(locationId).orElse(null);
        ResponseEvent<locationDomain> responseEvent = new ResponseEvent<locationDomain>().ok("Success");
        responseEvent.setData( locationDomain );
        return  responseEvent;
    }

    /**
     * @param locationId
     * @return
     */
    @Override
    public ResponseEvent<locationDomain> deleteLocation(Long locationId) {
        locationDomain locationDomain = locationRepository.findById(locationId).orElse(null);
        if( locationDomain == null){
            ResponseEvent<locationDomain> responseEvent = new ResponseEvent<locationDomain>().ok("Failed");
        }
        locationRepository.delete(locationDomain );
        return new ResponseEvent<locationDomain>().ok("Deleted",locationDomain);
    }

}
