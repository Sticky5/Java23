package pl.winiarczyk.lesson4.homework.Regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\r{11}");
        Matcher matcher = pattern.matcher("71052400123");

        boolean matches = matcher.matches();
    }
}
