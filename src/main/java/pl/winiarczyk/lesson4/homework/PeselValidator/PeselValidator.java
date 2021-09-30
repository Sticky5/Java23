package pl.winiarczyk.lesson4.homework.PeselValidator;

public class PeselValidator {

    public static void validatePesel(String peselNumber) {
        if (!(peselNumber.matches("[0-9]+"))) {
            throw new WrongDataTypeException("Pesel number should contain only numbers.");
        }
        if (peselNumber.length() != 11) {
            throw new IllegalLengthException("Pesel number should contain 11 digits.");
        }
    }
}
