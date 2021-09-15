package pl.winiarczyk.lesson4.homework.ExtendedCalculator;

public class Addition implements MathOperations {

    @Override
    public double doMath(double number1, double number2) {
        return number1 + number2;
    }
}

