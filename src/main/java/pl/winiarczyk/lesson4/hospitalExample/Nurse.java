package pl.winiarczyk.lesson4.hospitalExample;

public class Nurse extends Employee {

    String level;


    @Override
    public double earnPayment() {
        return 2 * basicPayment;
    }
}
