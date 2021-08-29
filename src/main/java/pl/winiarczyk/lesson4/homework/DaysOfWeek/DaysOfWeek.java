package pl.winiarczyk.lesson4.homework.DaysOfWeek;


public class DaysOfWeek {

    public static String getDayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
        }
        return "There is no such a day!";
    }

    public static void main(String[] args) {
        System.out.println(getDayName(7));
    }
}
