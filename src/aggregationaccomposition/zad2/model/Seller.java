package aggregationaccomposition.zad2.model;

import java.util.Objects;

public class Seller {
    private Person person;
    private Address address;

    public Seller(Person seller, Address address) {
        this.person = seller;
        this.address = address;
    }

    public Seller(Person seller) {
        this.person = seller;
    }

    public Person getPerson() {
        return person;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller1 = (Seller) o;
        return Objects.equals(person, seller1.person) && Objects.equals(address, seller1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, address);
    }

    @Override
    public String toString() {
        return "Seller: seller - " + person +
                ", address - " + address;
    }
}
