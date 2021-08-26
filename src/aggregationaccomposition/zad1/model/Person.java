package aggregationaccomposition.zad1.model;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private String pesel;
    Address registeredAddress;
    Address residenceAddress;

    public Person(String firstName, String lastName, String pesel, Address registeredAddress, Address residenceAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.registeredAddress = registeredAddress;
        this.residenceAddress = residenceAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public Address getRegisteredAddress() {
        return registeredAddress;
    }

    public Address getResidenceAddress() {
        return residenceAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(pesel, person.pesel) && Objects.equals(registeredAddress, person.registeredAddress) && Objects.equals(residenceAddress, person.residenceAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel, registeredAddress, residenceAddress);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", registeredAddress=" + registeredAddress +
                ", residenceAddress=" + residenceAddress +
                '}';
    }
}
