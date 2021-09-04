package pl.winiarczyk.lesson4.carExample;

public class Car implements Drive {

    double mileage;
    int doors;
    Brand brand;
    String model;
    Engine engine;

    public Car() {
        this.mileage = 25;
    }

    public Car(int doors, Brand brand, String model) { //to jest konstruktor
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

    @Override
    public void forward() {
        mileage += 5;
    }

    @Override
    public void backward() {
        mileage -= 5;
    }
}
