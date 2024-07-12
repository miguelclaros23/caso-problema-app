package co.org.rickymorty.core.application.services.app;


import co.org.rickymorty.core.application.services.ApiBuilder;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import retrofit2.Response;

import java.util.Objects;

@Slf4j
@Component
public class rickAndMortyManagerMicroserviceImpl {
    private final rickAndMortyApiManagerMicroservice rickAndMortyApiManagerMicroservice;

    @Autowired
    public rickAndMortyManagerMicroserviceImpl(@Value("${apis.armi-orders-manager.url}") String url) {
        this.rickAndMortyApiManagerMicroservice = ApiBuilder.get().createService(rickAndMortyApiManagerMicroservice.class, url);
    }

    public Response<JsonObject> getAllLocation() {
        Response<JsonObject> response = null;
        try {
            log.info("/migrate/Location: Logs-> ");
            response = rickAndMortyApiManagerMicroservice.getAllLocation().execute();
        } catch (Exception exception) {
            log.error("Excepcion Error: Logs-> {}", exception.getMessage());
        }
        return response;
    }

    public Response<JsonObject> getAllCharacter() {
        Response<JsonObject> response = null;
        try {
            log.info("/migrate/character: Logs-> ");
            response = rickAndMortyApiManagerMicroservice.getAllCharacter().execute();
        } catch (Exception exception) {
            log.error("Excepcion Error: Logs-> {}", exception.getMessage());
        }
        return response;
    }

}
