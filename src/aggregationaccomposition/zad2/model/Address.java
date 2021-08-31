package aggregationaccomposition.zad2.model;

import java.util.Objects;

public class Address {

    private String city;
    private String street;
    private String homeNr;
    private String flatNr;
    private String postalCode;

    public Address(String city, String street, String homeNr, String flatNr, String postalCode) {
        this.city = city;
        this.street = street;
        this.homeNr = homeNr;
        this.flatNr = flatNr;
        this.postalCode = postalCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(homeNr, address.homeNr) && Objects.equals(flatNr, address.flatNr) && Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, homeNr, flatNr, postalCode);
    }

    @Override
    public String toString() {
        return "Address: " +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", homeNr='" + homeNr + '\'' +
                ", flatNr='" + flatNr + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
