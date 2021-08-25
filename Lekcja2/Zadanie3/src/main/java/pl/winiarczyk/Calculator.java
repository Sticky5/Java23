package pl.winiarczyk;

public class Calculator {

    public static int sum(int num1, int num2) {
        int sumResult = num1 + num2;
        return sumResult;
    }
    public static int substract(int num1, int num2) {
        int subResult = num1 - num2;
        return subResult;
    }
    public static int multiplication(int num1, int num2) {
        int multiResult = num1 * num2;
        return multiResult;
    }
    public static int division(int num1, int num2) {
        int divResult = num1 / num2;
        return divResult;
    }

    public static void main( String[] args ) {
        System.out.println(sum(5,10));
        System.out.println(substract(10,7));
        System.out.println(multiplication(4,6));
        System.out.println(division(24,2));
    }
}
