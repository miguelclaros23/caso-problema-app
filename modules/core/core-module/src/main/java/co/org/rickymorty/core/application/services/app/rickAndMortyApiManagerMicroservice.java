package co.org.rickymorty.core.application.services.app;


import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.http.*;

public interface rickAndMortyApiManagerMicroservice {

    @GET("/character")
    Call<JsonObject> getAllCharacter();

    @GET("/location")
    Call<JsonObject> getAllLocation();
}
