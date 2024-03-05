/*
 *
 * Name: Keith Loh
 */

public class InvalidInfoException extends Exception {
    public InvalidInfoException(String message) {
        super(message);
    }

    public InvalidInfoException(String message, Throwable cause) {
        super(message, cause);
    }
}
