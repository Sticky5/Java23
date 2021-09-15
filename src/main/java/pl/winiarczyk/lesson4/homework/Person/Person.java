package pl.winiarczyk.lesson4.homework.Person;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String bornCity;
    private int insuranceNumber;

    public Person(String name, String surname, String bornCity, int insuranceNumber) {
        this.name = name;
        this.surname = surname;
        this.bornCity = bornCity;
        this.insuranceNumber = insuranceNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBornCity() {
        return bornCity;
    }

    public int getInssuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return insuranceNumber == person.insuranceNumber && Objects.equals(name, person.name)
                && Objects.equals(surname, person.surname) && Objects.equals(bornCity, person.bornCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, bornCity, insuranceNumber);
    }
}