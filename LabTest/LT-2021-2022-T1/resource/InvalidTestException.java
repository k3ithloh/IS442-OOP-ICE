
public class InvalidTestException extends RuntimeException {
    // it is an unchecked exception
    public InvalidTestException(String message) {
        super(message);
    }

    public InvalidTestException(String message, Throwable cause) {
        super(message, cause);
    }
}
