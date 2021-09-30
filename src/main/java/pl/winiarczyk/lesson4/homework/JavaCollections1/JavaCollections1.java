package pl.winiarczyk.lesson4.homework.JavaCollections1;

import java.util.ArrayList;
import java.util.List;

public class JavaCollections1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        Printer.printWithoutDuplicates(names);
        Printer.printReversed(names);
        Printer.printWithReplacedElements("Anna", "Joanna", names);
    }
}
