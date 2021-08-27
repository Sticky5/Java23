package pl.winiarczyk.lesson4.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerifyTest {

    @Test
    void shouldCheckIfAgeIsOver18() {
        int testMatureAge = 22;

        boolean isOver18YO = AgeVerify.isMature(testMatureAge);

        Assertions.assertTrue(isOver18YO);
    }
}