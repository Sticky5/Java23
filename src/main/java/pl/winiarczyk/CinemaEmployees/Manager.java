package pl.winiarczyk.CinemaEmployees;

public class Manager extends BaseEmployee {
    static final int salary = 5000;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    private int bonus = 500;

    public Manager(String name, String surname, int hireYear) {
        super(name, surname, hireYear);
    }

    @Override
    public int calculateMonthlySalary() {
        return salary + bonus;
    }
}
