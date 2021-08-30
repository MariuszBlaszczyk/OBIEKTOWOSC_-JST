package aggregationaccomposition.zad2.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

    private String title;
    private String description;
    private BigDecimal price;

    public Item(String title, String description, BigDecimal price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item subject = (Item) o;
        return Objects.equals(title, subject.title) && Objects.equals(description, subject.description) && Objects.equals(price, subject.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, price);
    }

    @Override
    public String toString() {
        return "Item: title - " + title +
                ", description - " + description +
                ", price - " + price;
    }
}
