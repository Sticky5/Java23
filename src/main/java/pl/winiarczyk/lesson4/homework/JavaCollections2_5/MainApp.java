package pl.winiarczyk.lesson4.homework.JavaCollections2_5;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Integer[] inputInteger = new Integer[]{4, 2, 5, 1, 7};
        BubbleSort<Integer> bsInteger = new BubbleSort<>(inputInteger);
        Integer[] outputInteger = bsInteger.bubbleSort();

        System.out.println(Arrays.toString(outputInteger));
    }
}
