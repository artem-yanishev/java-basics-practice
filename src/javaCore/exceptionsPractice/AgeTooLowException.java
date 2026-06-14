package javaCore.exceptionsPractice;

public class AgeTooLowException extends RuntimeException {
    public AgeTooLowException(String message) {
        super(message);
    }
}
