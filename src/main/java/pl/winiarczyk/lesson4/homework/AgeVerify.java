package pl.winiarczyk.lesson4.homework;

public class AgeVerify {

  public static boolean isMature(int age) {
    return age >= 18;
  }

  public static void main(String[] args) {
    if(isMature(22)) {
      System.out.println("Your age is ok.");
    } else {
      System.out.println("Your age isn't ok.");
    }
  }
}