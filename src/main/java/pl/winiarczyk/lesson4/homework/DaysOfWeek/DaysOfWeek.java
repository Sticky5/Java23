package pl.winiarczyk.lesson4.homework.DaysOfWeek;


public class DaysOfWeek {

    public static void printDay(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("There is no such a day!");
                break;
        }
    }

    public static void main(String[] args) {
        printDay(9);
    }
}
