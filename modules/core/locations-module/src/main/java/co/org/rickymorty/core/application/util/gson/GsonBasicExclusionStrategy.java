
package co.org.rickymorty.core.application.util.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;


public class GsonBasicExclusionStrategy implements ExclusionStrategy {

  @Override
  public boolean shouldSkipField(FieldAttributes attributes) {
    return attributes.getAnnotation(GsonExcludeField.class) != null;
  }

  @Override
  public boolean shouldSkipClass(Class<?> clazz) {
    return false;
  }

}
