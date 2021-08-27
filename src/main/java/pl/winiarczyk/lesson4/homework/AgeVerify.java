package pl.winiarczyk.lesson4.homework;

public class AgeVerify {

  public static int isAgeOver(int age) {

    if(age >= 18) {
      System.out.println("Your age is ok!");
    }else{
      System.out.println("Your age isn't ok!");
    }
    return age;
  }

  public static void main(String[] args) {
    isAgeOver(22);
  }
}