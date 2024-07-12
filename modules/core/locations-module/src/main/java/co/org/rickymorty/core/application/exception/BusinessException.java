
package co.org.rickymorty.core.application.exception;

/**
 * [description]
 *
 * @author: Diego Poveda <diego.poveda@ricky-morty.com>
 * @version 3.0-SNAPSHOT
 * @since: 1.8
 */
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
