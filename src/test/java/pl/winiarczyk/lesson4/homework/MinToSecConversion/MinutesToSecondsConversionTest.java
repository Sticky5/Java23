package pl.winiarczyk.lesson4.homework.MinToSecConversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesToSecondsConversionTest {

    @Test
    public void shouldConvert44MinutesToSeconds() {
        double timeInMinutes = 44;

        double timeInSeconds = MinutesToSecondsConversion.convertMinutesToSeconds(timeInMinutes);

        Assertions.assertEquals(timeInSeconds, 2640);
    }

    @Test
    public void shouldConvert0MinutesToSeconds() {
        double timeInMinutes = 0;

        double timeInSeconds = MinutesToSecondsConversion.convertMinutesToSeconds(timeInMinutes);

        Assertions.assertEquals(timeInSeconds, 0);

    }
}