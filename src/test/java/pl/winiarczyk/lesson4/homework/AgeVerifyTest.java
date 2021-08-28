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
    void shouldCheckIfAgeIsUnder18() {
        int testMatureAge = 14;

        boolean isOver18 = AgeVerify.isMature(testMatureAge);

        Assertions.assertFalse(isOver18);
    }
}