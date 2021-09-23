package object.zad2.model;

import java.util.Objects;

public class Address {

    private String city;
    private String street;
    private String postalCode;
    private String homeNo;
    private String flatNo;

    public Address(String city, String street, String postalCode, String homeNo, String flatNo) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(postalCode, address.postalCode) && Objects.equals(homeNo, address.homeNo) && Objects.equals(flatNo, address.flatNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, postalCode, homeNo, flatNo);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", homeNo='" + homeNo + '\'' +
                ", flatNo='" + flatNo + '\'' +
                '}';
    }
}
