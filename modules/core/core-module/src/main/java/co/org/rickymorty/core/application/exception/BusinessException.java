
package co.org.rickymorty.core.application.exception;


public class BusinessException extends Exception {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   *
   */
  public BusinessException() {
    super();
  }

  /**
   *
   * @param message
   */
  public BusinessException(String message) {
    super(message);
  }

  /**
   *
   * @param cause
   */
  public BusinessException(Throwable cause) {
    super(cause);
  }

  /**
   *
   * @param message
   * @param cause
   */
  public BusinessException(String message, Throwable cause) {
    super(message, cause);
  }

}
