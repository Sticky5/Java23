package pl.winiarczyk.lesson4.example;

public class Car {

    double mileage;
    int doors;
    String brand;
    String model;

    public Car(){
        this.mileage = 25;
    }

    public Car(int doors, String brand, String model) { //to jest konstruktor
        this.doors = doors;
        this.brand = brand;
        this.model = model;
        this.mileage = -1000;
    }

    public void horn() {
        System.out.println("Beeeeeep!");
    }

    public double drive(double mileage) {
        this.mileage += mileage;
        return this.mileage;
    }
}
