package pl.winiarczyk.lesson4.homework.Numbers;

public class EvenAndOddNumbers {

    public static boolean isNumberOddOrEven(int checkNumber) {
        return checkNumber % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isNumberOddOrEven(498));
    }
}
