
package co.org.rickymorty.core.application.util.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GsonBasicBuilder {

  private final GsonBasicExclusionStrategy exclusionStrategy = new GsonBasicExclusionStrategy();

  public Gson create() {
    return new GsonBuilder().setExclusionStrategies(exclusionStrategy).create();
  }

}
