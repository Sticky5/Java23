package pl.winiarczyk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void shouldAddTwoNumbers1and1() {
        int num1 = 1;
        int num2 = 1;

        int sum = Calculator.sum(num1, num2);

        Assertions.assertEquals(2, sum);
    }
    @Test
    void shouldSubstractTwoNumbers4and2() {
        int num1 = 4;
        int num2 = 2;

        int substract = Calculator.substract(num1, num2);

        Assertions.assertEquals(2, substract);
    }
    @Test
    void shouldMultiplyTwoNumbers3and3() {
        int num1 = 3;
        int num2 = 3;

        int multiplication = Calculator.multiplication(num1, num2);

        Assertions.assertEquals(9, multiplication);
    }
    @Test
    void shouldDivideTwoNumbers10and5() {
        int num1 = 10;
        int num2 = 5;

        int division = Calculator.division(num1, num2);

        Assertions.assertEquals(2, division);
    }
}
