package pl.winiarczyk.lesson4.homework.DivideBy3;

public class App {
    public static void main( String[] args ) {
        int[] numbers1 = {1, 3, 7, 99, 363, 457};
        int[] numbers2 = {2, 5, 9, 12};

        DivisibilityValidator.validate(numbers1);
        System.out.println();
        DivisibilityValidator.validate(numbers2);
    }
}
