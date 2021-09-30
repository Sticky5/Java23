package pl.winiarczyk.lesson4.homework.GeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void shouldCheckSquarePerimeterKnowingSideA2() {
        int sideA = 2;

        Square square = new Square(sideA);

        double result = square.getPerimeter();

        Assertions.assertEquals(8, result, 1);
    }

    @Test
    public void shouldCheckSquareAreaKnowingSideA2() {
        int sideA = 2;

        Square square = new Square(sideA);

        double result = square.getArea();

        Assertions.assertEquals(4, result, 1);
    }
}
