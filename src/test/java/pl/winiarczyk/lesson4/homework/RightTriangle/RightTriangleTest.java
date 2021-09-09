package pl.winiarczyk.lesson4.homework.RightTriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RightTriangleTest {

    @Test
    public void shouldCheckIfThereIsRightTriangleWithSideA4SideB6SideC10() {
        int sideA = 4;
        int sideB = 6;
        int sideC = 10;

        boolean isRightTriangle = RightTriangle.isRightTriangle(sideA,sideB,sideC);

        Assertions.assertTrue(isRightTriangle);
    }
    @Test
    public void shouldCheckIfThereIsNotTriangleWithSideA5SideB7SideC9() {
        int sideA = 5;
        int sideB = 7;
        int sideC = 9;

        boolean isNotRightTriangle = RightTriangle.isRightTriangle(sideA,sideB,sideC);

        Assertions.assertFalse(isNotRightTriangle);
    }
}