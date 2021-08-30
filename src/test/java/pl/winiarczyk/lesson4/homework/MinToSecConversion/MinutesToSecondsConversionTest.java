package pl.winiarczyk.lesson4.homework.MinToSecConversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesToSecondsConversionTest {

    double timeInMinutes;

    @Test
    public void shouldConvert44MinutesToSeconds() {
        timeInMinutes = 44;

        double timeInSeconds = MinutesToSecondsConversion.convertMinutesToSeconds(timeInMinutes);

        Assertions.assertEquals(timeInSeconds, 2640);
    }

    @Test
    public void shouldConvert0MinutesToSeconds() {
        timeInMinutes = 0;

        double timeInSeconds = MinutesToSecondsConversion.convertMinutesToSeconds(timeInMinutes);

        Assertions.assertEquals(timeInSeconds, 0);

    }
}