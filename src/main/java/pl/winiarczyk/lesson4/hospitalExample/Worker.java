package pl.winiarczyk.lesson4.hospitalExample;

public class Worker extends Employee {


    @Override
    public double earnPayment() {
        return basicPayment;
    }
}
