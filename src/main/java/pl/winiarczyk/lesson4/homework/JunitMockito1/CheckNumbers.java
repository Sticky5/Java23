package pl.winiarczyk.lesson4.homework.JunitMockito1;

public class CheckNumbers {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int sumOfNumbers(int number) {
        int score = 0;

        if (number < 0) {
            number = -number;
        }

        while (number > 0) {
            score += number % 10;
            number /= 10;
        }
        return score;
    }
}
