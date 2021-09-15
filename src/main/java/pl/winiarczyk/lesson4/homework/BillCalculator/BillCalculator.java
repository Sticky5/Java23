package pl.winiarczyk.lesson4.homework.BillCalculator;

public class BillCalculator {

    public double calculate(double valueOfTheBill, double servicePayment) {
        return valueOfTheBill + servicePayment;
    }

    public double calculate(double valueOfTheBill, double servicePayment, int discount) {
        return (valueOfTheBill + servicePayment) * (discount / 100);
    }

    public double calculate(double valueOfTheBill, double servicePayment, double takeAwayPackingFee) {
        return valueOfTheBill + servicePayment + takeAwayPackingFee;
    }
}
