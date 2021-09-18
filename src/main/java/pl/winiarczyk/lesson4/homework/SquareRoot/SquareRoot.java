package pl.winiarczyk.lesson4.homework.SquareRoot;

public class SquareRoot {

    public static double square(double number) {

        if (number > 0) {
        } else {
            throw new WrongNumberException("Given number should be over 0");
        }
        return Math.sqrt(number);
    }
}

