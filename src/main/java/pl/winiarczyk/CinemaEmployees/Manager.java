package pl.winiarczyk.CinemaEmployees;

public class Manager extends BaseEmployee {
    final int salary = 5000;
    int bonus = 500;

    public Manager(String name, String surname, int hireYear) {
        super(name, surname, hireYear);
    }

    @Override
    public int calculateMonthlySalary() {
        return salary + bonus;
    }
/*
    private final int basicPayment = 5000;

    private int bonus = 500;

    @Override
    public double calculateMonthlySalary() {
        return 0;
    }
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }*/
}
