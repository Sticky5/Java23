package pl.winiarczyk.lesson4.homework.PeselValidator;

public class WrongDataTypeException extends RuntimeException {
    public WrongDataTypeException(String message) {
        super(message);
    }
}
