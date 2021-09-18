package pl.winiarczyk.lesson4.homework.JunitMockito1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CheckNumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 62,224, -26})
    void shouldVerifyNumberIsEven(int input) {

        boolean isEven = CheckNumbers.isEven(input);

        Assertions.assertTrue(isEven);
    }

    @ParameterizedTest
    @CsvSource(value = {"432 : 9", "111 : 3", "789 : 24", "2947 : 22"}, delimiter = ':')
    void shouldCheckSumOfNumbers(String input, String expected) {

        int actualValue = Integer.parseInt(input);
        int expectedValue = Integer.parseInt(expected);

        actualValue = CheckNumbers.sumOfNumbers(actualValue);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}