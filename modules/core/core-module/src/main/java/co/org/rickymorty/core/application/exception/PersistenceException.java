
package co.org.rickymorty.core.application.exception;


public class PersistenceException extends Exception {

  private static final long serialVersionUID = 1L;

  /**
   *
   */
  public PersistenceException() {
    super();
  }

  /**
   *
   * @param message
   */
  public PersistenceException(String message) {
    super(message);
  }

  /**
   *
   * @param cause
   */
  public PersistenceException(Throwable cause) {
    super(cause);
  }

  /**
   *
   * @param message
   * @param cause
   */
  public PersistenceException(String message, Throwable cause) {
    super(message, cause);
  }

}
