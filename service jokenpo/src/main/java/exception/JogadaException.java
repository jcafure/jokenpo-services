package exception;

public class JogadaException extends RuntimeException {

    public JogadaException() {
    }

    public JogadaException(String message) {
        super(message);
    }

    public JogadaException(String message, Throwable cause) {
        super(message, cause);
    }

    public JogadaException(Throwable cause) {
        super(cause);
    }

    public JogadaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
