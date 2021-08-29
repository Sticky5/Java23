package pl.winiarczyk.lesson4.carExample;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car(4, Brand.BMW, "5");
        Car car = new Car(5, Brand.BMW, "212");
        Bmw bmw1 = new Bmw(4, Brand.BMW, "5");

//        System.out.println(myCar.drive(50));
//        System.out.println(car3.drive(50)); //wynik będzie 100 bo poprało to co UP + wpisane 50

        System.out.println(bmw.mileage);
    }
}
