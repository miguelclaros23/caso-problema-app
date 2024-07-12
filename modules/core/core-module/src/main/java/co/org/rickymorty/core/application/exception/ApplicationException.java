
package co.org.rickymorty.core.application.exception;


public class ApplicationException extends Exception {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  /**
   *
   */
  public ApplicationException() {
    super();
  }

  /**
   *
   * @param message
   */
  public ApplicationException(String message) {
    super(message);
  }

  /**
   *
   * @param cause
   */
  public ApplicationException(Throwable cause) {
    super(cause);
  }

  /**
   *
   * @param message
   * @param cause
   */
  public ApplicationException(String message, Throwable cause) {
    super(message, cause);
  }

}
