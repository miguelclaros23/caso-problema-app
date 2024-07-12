
package co.org.rickymorty.core.application.exception;


public class EncryptException extends Exception {

  private static final long serialVersionUID = 1L;

  public EncryptException() {
    super();
  }

  public EncryptException(String message) {
    super(message);
  }

  public EncryptException(Throwable cause) {
    super(cause);
  }

  public EncryptException(String message, Throwable cause) {
    super(message, cause);
  }

}
