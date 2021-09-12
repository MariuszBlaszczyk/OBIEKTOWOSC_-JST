package inheritance.zad2.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Course {

    private String id;
    private String name;
    private BigDecimal price;
    private String description;

    public Course(String id, String name, BigDecimal price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id) && Objects.equals(name, course.name) && Objects.equals(price, course.price) && Objects.equals(description, course.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, description);
    }

    @Override
    public String toString() {
        return "- id: " + id + "\n" +
                "- name: " + name + "\n" +
                "- price: " + price + " zł\n" +
                "- description: " + description;}
}
