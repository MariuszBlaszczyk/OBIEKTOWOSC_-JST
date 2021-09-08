package encapsulation.zad1.logic;

import java.util.Objects;

public class Client {

    private String firstName;
    private String lastName;
    private boolean isPremium;

    public Client(String firstName, String lastName, boolean isPremium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isPremium = isPremium;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public boolean isPremium() {
        return isPremium;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return isPremium == client.isPremium && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, isPremium);
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }
}
