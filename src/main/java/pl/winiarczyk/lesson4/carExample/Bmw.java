package pl.winiarczyk.lesson4.carExample;

public class Bmw extends Car{

//    double mileage;  //to jest nie potrzebne bo zostało wykorzystane z klasy Car
//    int doors;
//    String brand;
//    String model;

    boolean turnSignals = false;

    Bmw(final int doors, final String brand, final  String model) {
        super(doors,brand,model);
//    public Bmw(double mileage, int doors) {
//        this.mileage = mileage;
//        this.doors = doors;
//        this.brand = "BMW";
//        this.model = "5";
    }
}
