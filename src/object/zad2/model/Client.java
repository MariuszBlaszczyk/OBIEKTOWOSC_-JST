package object.zad2.model;

import java.util.Objects;

public class Client {

    private String firstName;
    private String lastName;
    private String id;
    private Address address;

    public Client(String firstName, String lastName, String id, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(id, client.id) && Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id, address);
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", address=" + address +
                '}';
    }
}
