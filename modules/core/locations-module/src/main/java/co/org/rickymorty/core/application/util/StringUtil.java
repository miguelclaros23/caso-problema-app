package co.org.rickymorty.core.application.util;

public final class StringUtil {

  public static final String deleteGuionOrderIdXStore(String str) {
    return str == null ? null : str.split("-")[0];
  }
}
