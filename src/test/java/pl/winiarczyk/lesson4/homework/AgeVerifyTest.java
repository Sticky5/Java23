package pl.winiarczyk.lesson4.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerifyTest {

    @Test
    void shouldCheckIfAgeIsOver18() {
        int testMatureAge = 22;

        boolean isOver18 = AgeVerify.isMature(testMatureAge);

        Assertions.assertTrue(isOver18);
    }

    @Test
    void shouldCheckIfAgeIsOver() {
        int testMatureAge2 = 59;

        boolean isOver18 = AgeVerify.isMature(testMatureAge2);

        Assertions.assertTrue(isOver18);
    }
    @Test
    void shouldCheckAge() {
        int testNotMatureAge = 11;

        boolean isOver = AgeVerify.isMature(testNotMatureAge);

        Assertions.assertFalse(isOver);
    }
    @Test
    void shouldCheckIfAgeIsMature() {
        int testNotMatureAge = 3;

        boolean isOver = AgeVerify.isMature(testNotMatureAge);

        Assertions.assertFalse(isOver);
    }
}