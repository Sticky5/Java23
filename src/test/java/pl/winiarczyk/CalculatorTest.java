package pl.winiarczyk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void shouldReturn5WhenAdd2To3() {
    //2+3 = 5
    //given
    int value1 = 2;
    int value2 = 3;
    //when
    int result = Calculator.add(value1, value2);
    //then
    Assertions.assertEquals(5, result);
  }

  @Test
  void shouldReturnMinIntegerWhenAdd1ToMaxInteger() {

    //given
    int value1 = Integer.MAX_VALUE;
    int value2 = 1;
    //when
    int result = Calculator.add(value1, value2);
    //then
    Assertions.assertEquals(-2147483648, result);
  }

  @Test
  void shouldReturn0WhenAdd5ToMinus5() {
    //given
    int value1 = 5;
    int value2 = -5;
    //when
    int result = Calculator.add(value1, value2);
    //then
    Assertions.assertEquals(0, result);
  }

}