
package co.org.rickymorty.core.api.events;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ResponseEvent<T> {

  /**
   * Codigo de respuesta
   */
  private ResponseCode code;
  /**
   * Mensaje de respuesta
   */
  private String message;
  /**
   * Número de la página solicitada
   */
  private Integer number;
  /**
   * Número de registros que vienen en la página
   */
  private Integer numberOfElements;
  /**
   * Cantidad de registros por página
   */
  private Integer size;
  /**
   * Cantidad total de registros para la consulta
   */
  private Long totalElements;
  /**
   * Cantidad de páginas para la consulta
   */
  private Integer totalPages;
  /**
   * true si la consulta retorna registros
   */
  private Boolean hasContent;
  /**
   * true si existe la pagina siguiente
   */
  private Boolean hasNext;
  /**
   * true si existe la página anterior
   */
  private Boolean hasPrevius;
  /**
   * true si es la primera página
   */
  private Boolean isFirst;
  /**
   * true si es la última página
   */
  private Boolean isLast;
  /**
   * data
   */
  private T data;

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> ok(String message) {
    return ok(message, null);
  }

  /**
   * @param message
   * @param data
   * @return
   */
  public ResponseEvent<T> ok(String message, T data) {
    setCode(ResponseCode.OK);
    setMessage(message);
    setData(data);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> noContent(String message) {
    setCode(ResponseCode.NO_CONTENT);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> notFound(String message) {
    setCode(ResponseCode.NOT_FOUND);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> notImplemented(String message) {
    setCode(ResponseCode.NOT_IMPLEMENTED);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> badRequest(String message) {
    setCode(ResponseCode.BAD_REQUEST);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> unauthorized(String message) {
    setCode(ResponseCode.UNAUTHORIZED);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> forbidden(String message) {
    setCode(ResponseCode.FORBIDDEN);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> conflict(String message) {
    setCode(ResponseCode.CONFLICT);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> businessError(String message) {
    setCode(ResponseCode.BUSSINESS_ERROR);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> applicationError(String message) {
    setCode(ResponseCode.APPLICATION_ERROR);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> paymentAproved(String message) {
    setCode(ResponseCode.PAYMENT_APROVED);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> paymentDeclined(String message) {
    setCode(ResponseCode.PAYMENT_DECLINED);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> paymentRepeatTransaction(String message) {
    setCode(ResponseCode.PAYMENT_REPEAT_TRANSACTION);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> paymentDailyAttemptsExceeded(String message) {
    setCode(ResponseCode.PAYMENT_DAILY_ATTEMPTS_EXCEEDED);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> paymentDuplicated(String message) {
    setCode(ResponseCode.PAYMENT_DUPLICATED);
    setMessage(message);
    return this;
  }

  /**
   * @param message
   * @return
   */
  public ResponseEvent<T> paymentError(String message) {
    setCode(ResponseCode.PAYMENT_ERROR);
    setMessage(message);
    return this;
  }

  public ResponseEvent<T> methodNotAllowed(String message) {
    setCode(ResponseCode.METHOD_NOT_ALLOWED);
    setMessage(message);

    return this;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
