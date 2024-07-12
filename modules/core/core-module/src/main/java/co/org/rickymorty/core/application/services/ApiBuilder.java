package co.org.rickymorty.core.application.services;

import com.google.gson.*;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApiBuilder {

  private static ApiBuilder instance;

  private ApiBuilder() {
  }

  public static ApiBuilder get() {
    if (Objects.isNull(instance))
      instance = getSync();
    return instance;
  }

  private static synchronized ApiBuilder getSync() {
    if (Objects.isNull(instance))
      instance = new ApiBuilder();
    return instance;
  }

  private static Retrofit.Builder createRetrofitBuilder(String baseUrl) {

    OkHttpClient okHttpClient = new OkHttpClient.Builder()
        .connectTimeout(1, TimeUnit.MINUTES)
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .build();

    GsonBuilder builder = new GsonBuilder()
        .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
        .setPrettyPrinting()
        .registerTypeAdapter(Date.class, (JsonDeserializer) (JsonElement json, Type typeOfT, JsonDeserializationContext context) -> new Date(json.getAsJsonPrimitive().getAsLong()));

    return new Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create(builder.create()));
  }

  public <S> S createService(Class<S> serviceClass, String baseURL) {

    Retrofit.Builder builder = createRetrofitBuilder(baseURL);

    return builder.build().create(serviceClass);
  }

}
