package pl.winiarczyk.lesson4.homework.TextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public static void main(String[] args) throws IOException {

        String text = Files.readString(Path.of("C:\\Users\\Lenovo\\Java23\\data.txt"));
        System.out.println(text);
    }
}
