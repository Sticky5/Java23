package pl.winiarczyk.lesson4.homework.RightTriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    public void shouldCheckIfThereIsRightTriangleWithSideA4SideB6SideC10() {
        int sideA = 4;
        int sideB = 6;
        int sideC = 10;

        boolean isRightTriangle = Triangle.isRightTriangle();

        Assertions.assertTrue(isRightTriangle);
    }
    @Test
    public void shouldCheckIfThereIsNotRightTriangleWithSideA5SideB7SideC9() {
        int sideA = 5;
        int sideB = 7;
        int sideC = 9;

        boolean isNotRightTriangle = Triangle.isRightTriangle();

        Assertions.assertFalse(isNotRightTriangle);
    }
}