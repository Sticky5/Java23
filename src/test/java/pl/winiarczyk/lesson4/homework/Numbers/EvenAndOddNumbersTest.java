package pl.winiarczyk.lesson4.homework.Numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvenAndOddNumbersTest {

    @Test
    void shouldCheckIfNumber44IsEven() {
        int evenNumber = 44;

        boolean result = EvenAndOddNumbers.isNumberOddOrEven(evenNumber);

        Assertions.assertTrue(result);
    }
    @Test
    void shouldCheckIfNumber99isOdd() {
        int oddNumber = 99;

        boolean result = EvenAndOddNumbers.isNumberOddOrEven(oddNumber);

        Assertions.assertFalse(result);
    }
}