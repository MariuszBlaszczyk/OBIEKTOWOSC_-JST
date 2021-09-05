package methodconstructors.zad3.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Offer {

    private Product product;
    private BigDecimal price;
    private boolean special;

    public Offer(Product product, BigDecimal price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }



    public BigDecimal getPrice() {
        return price;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return special == offer.special && Objects.equals(product, offer.product) && Objects.equals(price, offer.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price, special);
    }

    @Override
    public String toString() {
        return product.getName() + " " + product.getProducer() + " " +
                getPrice() + "zł. Oferta specjalna? " + special;
    }
}
