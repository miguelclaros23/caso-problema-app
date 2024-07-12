
package co.org.rickymorty.adapter.adapter.rest.domain;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionResponse {

  private String language;
  private String code;
  private String message;

  public ExceptionResponse(String language, String code, String message) {
    this.language = language;
    this.code = code;
    this.message = message;
  }

  public ExceptionResponse(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public ExceptionResponse(String message) {
    this.message = message;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
