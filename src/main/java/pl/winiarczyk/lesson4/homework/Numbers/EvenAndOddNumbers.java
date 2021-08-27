package pl.winiarczyk.lesson4.homework.Numbers;

public class EvenAndOddNumbers {
    public static int evenNumbers(int checkNumber) {

        if (checkNumber % 2 == 0) {
            System.out.println("Number " + checkNumber + " is even.");
        }else{
            System.out.println("This number is odd.");
        }
        return checkNumber;
    }

    public static int oddNumbers(int checkNumber2) {

        if (checkNumber2 % 2 != 0) {
            System.out.println("Number " + checkNumber2 + " is odd.");
        }else {
            System.out.println("This number is even.");
        }
        return checkNumber2;
    }

    public static void main(String[] args) {
        evenNumbers(6);
        oddNumbers(9);
    }
}
