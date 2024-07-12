package co.org.rickymorty.adapter.adapter.rest.controller.app;

import co.org.rickymorty.adapter.adapter.rest.util.ResponseEntityUtility;
import co.org.rickymorty.core.api.domain.generic.GenericResponseDomain;
import co.org.rickymorty.core.api.domain.app.*;
import co.org.rickymorty.core.api.events.ResponseEvent;
import co.org.rickymorty.core.api.manager.app.appManager;
import co.org.rickymorty.core.application.entity.messenger.characterDomain;
import co.org.rickymorty.core.application.entity.messenger.locationDomain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/backend/v1/rest")
public class appController {
    @Autowired
    private appManager manager;


    @GetMapping("/migrate")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<GenericResponseDomain> migrateData( @Param("type") String type) {

        log.info("/migrate: Logs->  type {}  ", type);
        manager.migrateData( type );
        log.info("/migrate: Logs->  {} " );
        return new ResponseEvent<GenericResponseDomain>().ok("Migracion de datos del modulo"+type+" realizada correctamente ");
    }

    @GetMapping("/characters")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<charactersListDomain> allCharacter() {

        log.info("/characters: Logs-> ()");
        ResponseEvent<charactersListDomain> response = manager.allCharacter();
        log.info("/characters: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }

    @GetMapping("/characters/{id}")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<characterDomain> getCharacter( @PathVariable("characterId") Long characterId) {

        log.info("/characters/{id}: Logs->  characterId {}  ", characterId);
        ResponseEvent<characterDomain> response = manager.getCharacter( characterId );
        log.info("/characters/{id}: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }



    @PostMapping("/characters/{id}")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<characterDomain> createCharacter( @PathVariable("characterId") Long characterId, @RequestBody characterDomain charactersRequest) {

        log.info("/characters: Logs->  charactersRequest {}  ", charactersRequest);
        ResponseEvent<characterDomain> response = manager.updateCharacter(characterId,  charactersRequest );
        log.info("/characters: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }

    @PutMapping("/characters/{id}")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<characterDomain> updateCharacter(
            @PathVariable("characterId") Long characterId,
            @RequestBody characterDomain characterUpdateRequest) {

        log.info("/characters/{id}: Logs->  characterUpdateRequest {}  ", characterUpdateRequest);
        ResponseEvent<characterDomain> response = manager.updateCharacter( characterId, characterUpdateRequest );
        log.info("/characters/{id}: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }

    @DeleteMapping("/characters/{id}")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<characterDomain> deleteCharacter( @PathVariable("characterId") Long characterId) {

        log.info("/characters/{id}: Logs->  characterId {}  ", characterId);
        ResponseEvent<characterDomain> response = manager.deleteCharacter( characterId );
        log.info("/characters/{id}: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }

    @GetMapping("/Location")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<charactersListDomain> allLocation() {

        log.info("/Location: Logs-> ()");
        ResponseEvent<charactersListDomain> response = manager.allCharacter();
        log.info("/Location: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }

    @GetMapping("/Location/{id}")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<locationDomain> getLocation( @PathVariable("locationId") Long locationId) {

        log.info("/Location/{id}: Logs->  locationId {}  ", locationId);
        ResponseEvent<locationDomain> response = manager.getLocation( locationId );
        log.info("/Location/{id}: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }



    @PostMapping("/Location/{id}")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<locationDomain> createLocation( @PathVariable("locationId") Long locationId, @RequestBody locationDomain locationDomainRequest) {

        log.info("/Location: Logs->  locationDomainRequest {}  ", locationDomainRequest);
        ResponseEvent<locationDomain> response = manager.updateLocation(locationId,  locationDomainRequest );
        log.info("/Location: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }

    @PutMapping("/Location/{id}")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<locationDomain> updateLocation(
            @PathVariable("locationId") Long locationId,
            @RequestBody locationDomain locationDomainRequest) {

        log.info("/Location/{id}: Logs->  locationDomainRequest {}  ", locationDomainRequest);
        ResponseEvent<locationDomain> response = manager.updateLocation( locationId, locationDomainRequest );
        log.info("/Location/{id}: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }

    @DeleteMapping("/Location/{id}")
    @ResponseBody
    @CrossOrigin
    ResponseEvent<locationDomain> deleteLocation(@PathVariable("locationId") Long locationId) {

        log.info("/Location/{id}: Logs->  locationId {}  ", locationId);
        ResponseEvent<locationDomain> response = manager.deleteLocation( locationId );
        log.info("/Location/{id}: Logs->  {} ",response );
        return ResponseEntityUtility.buildHttpResponse(response).getBody();
    }



}
