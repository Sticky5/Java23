package pl.winiarczyk.lesson4.homework.RightTriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    public void shouldCheckIfThereIsRightTriangleWithSideA3SideB4SideC5() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;

        boolean isRightTriangle = new Triangle(sideA, sideB, sideC).isRightTriangle();

        Assertions.assertTrue(isRightTriangle);
    }

    @Test
    public void shouldCheckIfThereIsNotRightTriangleWithSideA5SideB7SideC9() {
        int sideA = 5;
        int sideB = 7;
        int sideC = 9;

        boolean isNotRightTriangle = new Triangle(sideA, sideB, sideC).isRightTriangle();

        Assertions.assertFalse(isNotRightTriangle);
    }
}