package pl.winiarczyk.lesson4.homework.AreaAndPerimeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    public void shouldCheckRectanglePerimeterKnowingSideA1AndSideB3() {
        int sideA = 1;
        int sideB = 3;

        Rectangle rectangle = new Rectangle(sideA, sideB);

        double result = rectangle.getPerimeter();

        Assertions.assertEquals(8, result, 1);
    }

    @Test
    public void shouldCheckRectangleAreaKnowingSideA1AndSideB3() {
        int sideA = 1;
        int sideB = 3;

        Rectangle rectangle = new Rectangle(sideA, sideB);

        double result = rectangle.getArea();

        Assertions.assertEquals(3, result, 1);
    }
}