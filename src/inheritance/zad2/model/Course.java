package inheritance.zad2.model;

import java.math.BigDecimal;

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


}
