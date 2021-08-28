package pl.winiarczyk.lesson4.homework.DaysOfWeek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DaysOfWeekTest {
    @Test
    void shouldCheckMonday() {
        String day1 = "Monday";

        String result = DaysOfWeek.getDayName(1);

        Assertions.assertEquals(result, day1);
    }
    @Test
    void shouldCheckWeekends() {
        String weekend = "Weekend";

        String result1 = DaysOfWeek.getDayName(6);
        String result2 = DaysOfWeek.getDayName(7);

        Assertions.assertEquals(result1, weekend);
        Assertions.assertEquals(result2, weekend);
    }
    @Test
    void shouldCheckDefaultValue() {
        String properResult = "There is no such a day!";

        int badInput = 8;

        String result = DaysOfWeek.getDayName(badInput);

        Assertions.assertEquals(result, properResult);
    }
}