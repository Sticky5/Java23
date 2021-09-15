package pl.winiarczyk.lesson4.homework.ExtendedCalculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Addition addition = new Addition();
        Substraction substraction = new Substraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println("Select the action you want to implement: \n" +
                "Addition press \"+\" \n" +
                "Substraction press \"-\" \n" +
                "Multiplication press \"*\" \n" +
                "Division press \"/\" \n");

        String action = scanner.nextLine();
        System.out.println("Choose first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Choose second number");
        double secondNumber = scanner.nextDouble();
        System.out.println(firstNumber + " " + action + " " + secondNumber + " = ");

        switch (action) {
            case "+":
                System.out.println(addition.doMath(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(substraction.doMath(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(multiplication.doMath(firstNumber, secondNumber));
                break;
            case "/":
                System.out.println(division.doMath(firstNumber, secondNumber));
                break;
        }
    }
}
