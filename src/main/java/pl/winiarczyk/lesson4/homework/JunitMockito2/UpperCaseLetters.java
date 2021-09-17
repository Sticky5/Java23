package pl.winiarczyk.lesson4.homework.JunitMockito2;

public class UpperCaseLetters {

    public static String toUpperCaseLetters(String text) {
        if (text == null) {
            return "";
        }
        return text.toUpperCase();
    }
}
