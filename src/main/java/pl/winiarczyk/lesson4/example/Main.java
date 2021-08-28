package pl.winiarczyk.lesson4.example;

import pl.winiarczyk.lesson4.example.Car;

public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//        Car yourCar = new Car();
//        Car car3 = myCar; //odnosi się do myCar (to ten sam obiekt)

        Car bmw = new Car(4,"BMW", "5");


//        System.out.println(myCar.drive(50));
//        System.out.println(car3.drive(50)); //wynik będzie 100 bo poprało to co UP + wpisane 50

        System.out.println(bmw.mileage);
        System.out.println(bmw.doors);
        System.out.println(bmw.brand);
        System.out.println(bmw.model);
    }
}
