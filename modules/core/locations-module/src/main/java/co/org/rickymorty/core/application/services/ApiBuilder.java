package co.org.rickymorty.core.application.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiBuilder {

  private static ApiBuilder instance;

  private ApiBuilder() {
  }

  public static ApiBuilder get() {
    if (instance == null) {
      instance = getSync();
    }
    return instance;
  }

  private static synchronized ApiBuilder getSync() {
    if (instance == null) {
      instance = new ApiBuilder();
    }
    return instance;
  }

  private static Retrofit.Builder createRetrofitBuilder(String baseUrl) {

    Gson gson = new GsonBuilder()
            .enableComplexMapKeySerialization()
            .serializeNulls()
            .setPrettyPrinting()
            .excludeFieldsWithoutExposeAnnotation()
            .create();

    return new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create());
  }

  public <S> S createService(Class<S> serviceClass, String baseURL) {

    Retrofit.Builder builder = createRetrofitBuilder(baseURL);

    Retrofit retrofit = builder.build();
    return retrofit.create(serviceClass);
  }

}
