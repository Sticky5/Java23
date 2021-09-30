package pl.winiarczyk.lesson4.homework.PeselValidator;

public class IllegalLengthException extends RuntimeException {
    public IllegalLengthException(String message) {
        super(message);
    }
}
