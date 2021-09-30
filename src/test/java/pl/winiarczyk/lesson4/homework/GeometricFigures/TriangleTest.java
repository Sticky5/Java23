package pl.winiarczyk.lesson4.homework.GeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void shouldCheckTrianglePerimeterKnowingSideA2AndSideB3AndSideC4() {
        int sideA = 2;
        int sideB = 3;
        int sideC = 4;

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        double result = triangle.getPerimeter();

        Assertions.assertEquals(9, result, 1);
    }

    @Test
    public void shouldCheckRectangleAreaKnowingSideA1AndSideB3() {
        int sideA = 2;
        int sideB = 3;
        int sideC = 4;

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        double result = triangle.getArea();

        Assertions.assertEquals(2.90, result, 0.01);
    }
}
