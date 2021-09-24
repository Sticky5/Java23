package pl.winiarczyk.lesson4.homework.JunitMockito5;

import java.time.Month;

public class SeasonsCheck {

    public static String getSeason(Month month) {
        if (month == null) {
            return "";
        }
        String season = "";
        switch (month) {
            case MARCH:
            case APRIL:
            case MAY:
                season = Season.SPRING.toString();
            case JUNE:
            case JULY:
            case AUGUST:
                season = Season.SUMMER.toString();
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = Season.AUTUMN.toString();
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = Season.WINTER.toString();
        }
        return season;
    }

    public static void main(String[] args) {
        System.out.println(getSeason(Month.MAY));
    }
}
