package pl.winiarczyk.lesson4.homework.Numbers;

public class EvenAndOddNumbers {

    public static boolean isNumberOddOrEven(int checkNumber) {
        if (true) {
            return checkNumber % 2 == 0;
        }
        if (false) {
            return checkNumber % 2 != 0;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumberOddOrEven(4989));
    }
}
