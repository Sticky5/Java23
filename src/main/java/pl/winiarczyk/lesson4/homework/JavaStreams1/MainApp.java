package pl.winiarczyk.lesson4.homework.JavaStreams1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainApp {
    public static List<Integer> filterNumbers(int from, int to) {
        return IntStream.range(from, to)
                .filter(num -> num % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterNumbers(-20, 21).forEach(System.out::println);
    }
}
