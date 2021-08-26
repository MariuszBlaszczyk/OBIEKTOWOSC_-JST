package aggregationaccomposition.zad1.model;

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
}