package methodconstructors.zad3.main;

import methodconstructors.zad3.model.Offer;
import methodconstructors.zad3.model.Product;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Offer> offerList = new LinkedList<>();

        Product product1 = new Product("Czekolada mleczna", "Milka");
        Offer offer1 = new Offer(product1, new BigDecimal("3.99"), false);
        offerList.add(offer1);

        Product product2 = new Product("Napój gazowany", "Pepsi");
        Offer offer2 = new Offer(product2, new BigDecimal("5.99"), true);
        offerList.add(offer2);

        System.out.println("Offer nr 1: " + offer1);
        System.out.println("Offer nr 2: " + offer2);

        for (int i = 0; i < offerList.size(); i++) {
            System.out.println("Offer nr " + (i + 1) + " " + offerList.get(i));
        }

    }
}
