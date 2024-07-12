
package co.org.rickymorty.core.application.exception;


public class RepositoryException extends Exception {

  private static final long serialVersionUID = 2764567686470266253L;

  public RepositoryException(String message) {
    super(message);
  }

  public RepositoryException(String message, Throwable cause) {
    super(message, cause);
  }

}
