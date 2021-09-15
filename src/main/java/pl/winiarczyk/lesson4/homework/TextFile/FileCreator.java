package pl.winiarczyk.lesson4.homework.TextFile;

import java.io.*;

public class FileCreator {

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        String newFile = String.valueOf(file.createNewFile());

        PrintWriter writer = new PrintWriter(file);
        writer.println("Kurs");
        writer.println("Java");
        writer.println("Lekcja 6");
        writer.println("Pliki");
        writer.println("Wyjątki");
        writer.println("Pliki");
        writer.println("Koniec pliku");

        writer.close();
    }
}
