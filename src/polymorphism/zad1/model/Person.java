package polymorphism.zad1.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private BigDecimal salary;

    public Person(String firstName, String lastName, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getInfo() {
        return "- name: " + firstName + " " + lastName + "\n" +
                "- salary: " + salary + "PLN";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(salary, person.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary);
    }

    @Override
    public String toString() {
        return "- name: " + firstName + " " + lastName + "\n" +
                "- salary: " + salary + "PLN";
    }
}
