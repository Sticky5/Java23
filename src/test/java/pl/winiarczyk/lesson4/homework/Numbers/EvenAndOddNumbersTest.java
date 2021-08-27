package pl.winiarczyk.lesson4.homework.Numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EvenAndOddNumbersTest {

    @Test
    void shouldCheckIfNumberIsOdd() {
        int number = 26;

        int result = EvenAndOddNumbers.oddNumbers(number);

        Assertions.assertEquals(26, result);
    }

    @Test
    void shouldCheckIfNumberIsEven() {
        int number = 37;

        int result = EvenAndOddNumbers.evenNumbers(number);

        Assertions.assertEquals(37, result);
    }
}