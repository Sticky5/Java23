package pl.winiarczyk.CinemaEmployees;

public abstract class BaseEmployee {
    private String name;
    private String surname;
    final int SALARY = 3000;
    final int hireYear;

    public BaseEmployee(String name, String surname, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.hireYear = hireYear;
    }

    public abstract int calculateMonthlySalary();

    public int getYearsWorked(int currentYear) {
        return currentYear - hireYear;
    }
}
