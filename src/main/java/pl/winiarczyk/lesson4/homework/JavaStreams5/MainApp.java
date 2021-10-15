package pl.winiarczyk.lesson4.homework.JavaStreams5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Marek", "Tomasz", "Justyna", "Danuta",
                "Sandra", "Aleksy", "Marcin", "Patryk", "Adrianna", "Joanna", "Maria"));

        List<String> namesToUpperCase = names
                .stream()
                .map(String::toUpperCase)
                .map(MainApp::removeDuplicates)
                .collect(Collectors.toList());

        namesToUpperCase.forEach(System.out::println);
    }

    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();

        input
                .chars()
                .distinct()
                .forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}
