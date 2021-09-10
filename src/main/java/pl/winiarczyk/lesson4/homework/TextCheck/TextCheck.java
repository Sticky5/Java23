package pl.winiarczyk.lesson4.homework.TextCheck;

public class TextCheck {

    public static boolean isEmpty(String text) {
        System.out.println(text.isEmpty());
        return text.isEmpty();
    }

    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            char oppositeSymbol = text.charAt(text.length() - 1 - i);
            if (symbol != oppositeSymbol) {
                System.out.println("It isn't a palindrome.");
                return false;
            }
        }
        System.out.println("It is a palindrome.");
        return true;
    }

    public static int textLength(String text) {
        System.out.println("Your text contains " + text.length() + " letters.");
        return text.length();
    }
}
