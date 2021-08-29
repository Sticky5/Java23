package pl.winiarczyk.lesson4.hospitalExample;

public abstract class Employee {

    protected double basicPayment = 1000;

    String name;
    String surname;

    public abstract double earnPayment(); //przez to każda klasa musi powiedzieć co dla niej oznacza earnPayment

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
