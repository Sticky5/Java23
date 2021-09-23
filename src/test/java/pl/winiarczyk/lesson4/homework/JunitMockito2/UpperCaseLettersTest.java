package pl.winiarczyk.lesson4.homework.JunitMockito2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class UpperCaseLettersTest {

    @ParameterizedTest
    @ValueSource(strings = {"some", "text", "to", "check"})
    void shouldVerifyTextChangeToUpperCase(String input) {

        String expected = input.toUpperCase();
        String actual = UpperCaseLetters.toUpperCaseLetters(input);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldVerifyIfStringIsEmpty(String input) {
        String expected = "";
        String actual = UpperCaseLetters.toUpperCaseLetters(input);

        Assertions.assertEquals(expected, actual);
    }
}