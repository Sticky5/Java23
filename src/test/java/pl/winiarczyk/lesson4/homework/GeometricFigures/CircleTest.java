package pl.winiarczyk.lesson4.homework.GeometricFigures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void shouldCheckCirclePerimeterKnowingRadius3() {
        int radius = 3;

        Circle circle = new Circle(radius);

        double result = circle.getPerimeter();

        Assertions.assertEquals(18.84, result, 0.01);
    }

    @Test
    public void shouldCheckCircleAreaKnowingRadius3() {
        int radius = 3;

        Circle circle = new Circle(radius);

        double result = circle.getArea();

        Assertions.assertEquals(28.27, result, 0.01);
    }
}
