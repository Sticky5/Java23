package pl.winiarczyk.lesson4.homework.TextFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountCharacter {

    public static void main(String[] args) throws IOException {

        String text = Files.readString(Path.of("data.txt"));

        int count = 0;
        for (int i = count; i < text.length(); i++) {
            count++;
        }

        System.out.println("Number of characters in data.txt is: " + count);
    }
}
