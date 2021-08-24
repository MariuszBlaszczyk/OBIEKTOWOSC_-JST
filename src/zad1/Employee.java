package zad1;

import java.util.Objects;

public class Employee {

    private String name;
    private String lastName;
    private int birthYear;
    private int seniority;

    public Employee() {
    }

    public Employee(String name, String lastName, int birthYear, int seniority) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.seniority = seniority;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return birthYear == employee.birthYear && seniority == employee.seniority && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, birthYear, seniority);
    }

    @Override
    public String toString() {
        return "Employee: " +
                "Name: " + name + " " + lastName +
                ", birth year: " + birthYear +
                ", seniority " + seniority + ".";
    }
}
