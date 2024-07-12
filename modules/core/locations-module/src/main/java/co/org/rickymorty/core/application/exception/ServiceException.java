
package co.org.rickymorty.core.application.exception;

/**
 *
 * @author: Diego Poveda <diego.poveda@ricky-morty.com>
 * @version 3.0-SNAPSHOT
 * @since: 1.8
 */
public class ServiceException extends Exception {

  private static final long serialVersionUID = 2764567686470266253L;

  public ServiceException(String message) {
    super(message);
  }

  public ServiceException(String message, Throwable cause) {
    super(message, cause);
  }

}
