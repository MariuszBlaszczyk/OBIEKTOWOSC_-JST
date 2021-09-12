package inheritance.zad2.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Stationary extends Course {

    private String city;
    private int numberOfLessons;

    public Stationary(String id, String name, BigDecimal price, String description, String city, int numberOfLessons) {
        super(id, name, price, description);
        this.city = city;
        this.numberOfLessons = numberOfLessons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Stationary that = (Stationary) o;
        return numberOfLessons == that.numberOfLessons && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), city, numberOfLessons);
    }

    @Override
    public String toString() {
        return "Stationary course\n" +
               super.toString() + "\n" +
                "- city: " + city + "\n" +
                "- number of lessons " + numberOfLessons + "\n";
    }
}
