package pl.winiarczyk.lesson4.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.winiarczyk.lesson4.homework.AgeVerify.AgeVerify;

class AgeVerifyTest {

    @Test
    void ShouldCheckIfAgeIsOver18() {
        int age = 22;

        int ageOver = AgeVerify.isAgeOver(age);

        Assertions.assertEquals(22, ageOver);
    }
}