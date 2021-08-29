package pl.winiarczyk.CinemaEmployees;

public class BaseEmployee {
    private String name;
    private String surname;
    final int salary = 3000;
    final int hireYear;

    public BaseEmployee(String name, String surname, int hireYear) {
        this.name = name;
        this.surname = surname;
        this.hireYear = hireYear;
    }

    public int calculateMonthlySalary() {
        return salary;
    }

    public int getYearsWorked(int currentYear) {
        return currentYear - hireYear;
    }
}
