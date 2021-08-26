package classobjects.zad1.model;

import java.util.Objects;

public class Employee {

    private String name;
    private String lastName;
    private int birthYear;
    private Seniority seniority;


    public Employee(String name, String lastName, int birthYear, Seniority seniority) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Seniority getSeniority() {
        return seniority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return birthYear == employee.birthYear && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName) && seniority == employee.seniority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, birthYear, seniority);
    }

    @Override
    public String toString() {
        return "name: " + name + " " + lastName +
                ", " + "birth year: " + birthYear +
                ", " + "seniority: " + seniority.name() +
                " " + seniority.getSalaryLevel() + ".";
    }
}
