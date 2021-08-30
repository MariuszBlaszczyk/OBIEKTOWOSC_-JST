package aggregationaccomposition.zad2.model;

import java.util.Objects;

public class Auction {

    private Seller seller;
    private Item item;

    public Auction(Seller seller, Item item) {
        this.seller = seller;
        this.item = item;
    }

    public Seller getSeller() {
        return seller;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auction auction = (Auction) o;
        return Objects.equals(seller, auction.seller) && Objects.equals(item, auction.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seller, item);
    }

    @Override
    public String toString() {
        return "Auction{" +
                "seller=" + seller +
                ", subject=" + item +
                '}';
    }
}
