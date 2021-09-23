package enumtype.zad2.model;

public enum OrderStatus {
    NEW("złożono zamówienie, ale jeszcze go nie opłacono"),
    PAID("zamówienie opłacone"),
    SHIPPED("zamówienie wysłane"),
    DELIVERED("zamówienie dostarczone"),
    CANCELLED("zamówienie anulowano");


    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return name() + " - " + description;
    }
}
