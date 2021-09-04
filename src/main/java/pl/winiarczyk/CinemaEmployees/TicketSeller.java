package pl.winiarczyk.CinemaEmployees;

public class TicketSeller extends BaseEmployee {
    public TicketSeller(String name, String surname, int hireYear) {
        super(name, surname, hireYear);
    }

    @Override
    public int calculateMonthlySalary() {
        return SALARY;
    }
}
