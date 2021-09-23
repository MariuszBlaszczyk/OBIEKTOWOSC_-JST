package enumtype.zad2.model;


import java.math.BigDecimal;
import java.util.Objects;

public class Order {

    private String item;
    private BigDecimal price;
    private OrderStatus status;

    public Order() {
    }

    public Order(String item, BigDecimal price, OrderStatus status) {
        this.item = item;
        this.price = price;
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(item, order.item) && Objects.equals(price, order.price) && status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, price, status);
    }

    @Override
    public String toString() {
        return  item + " (" + price + "zł) - " + status;
    }


}
