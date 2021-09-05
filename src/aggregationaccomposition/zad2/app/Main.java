package aggregationaccomposition.zad2.app;

import aggregationaccomposition.zad2.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Auction> auctions = new ArrayList<>();

        Person person1 = new Person("Jan", "Kowalski");
        Address addressPerson1 = new Address("Wrocław", "Kościuszki", "24A", "21", "50-500");
        Seller seller1 = new Seller(person1, addressPerson1);
        Item item1 = new Item("Xbox One", "Konsola dla wymagających graczy",
                new BigDecimal("999.99"));
        Auction auction1 = new Auction(seller1, item1);
        auctions.add(auction1);

        Person person2 = new Person("Justyna", "Adamczyk");
        Seller seller2 = new Seller(person2);
        Item item2 = new Item("Samsung S20", "Niesamowity telefon z trzema obiektywami",
                new BigDecimal("3999"));
        Auction auction2 = new Auction(seller2, item2);
        auctions.add(auction2);

        int auctionsCounter = 1;
        for (Auction auction : auctions) {
            System.out.println("Auction nr " + auctionsCounter);
            auction.getSellerAndItemDetails();
            auctionsCounter++;
        }


    }
}
