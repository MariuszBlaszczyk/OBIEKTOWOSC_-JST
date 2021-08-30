package aggregationaccomposition.zad1.model;

import java.util.Objects;

public class Address {

    private String city;
    private String street;
    private String homeNumber;
    private String flatNumber;
    private String postalCode;


    public Address(String city, String street, String homeNumber, String flatNumber, String postalCode) {
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
        this.postalCode = postalCode;
    }


    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(homeNumber, address.homeNumber) && Objects.equals(flatNumber, address.flatNumber) && Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, homeNumber, flatNumber, postalCode);
    }

    @Override
    public String toString() {
        return
                city + ", " + street + ", " + homeNumber + ", " + flatNumber + ", " + postalCode;
    }

}
