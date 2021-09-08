package encapsulation.zad1.main;

import encapsulation.zad1.service.PrintService;
import encapsulation.zad1.logic.Client;
import encapsulation.zad1.service.DiscountService;

public class App {

    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 2100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        PrintService printService = new PrintService();
        printService.printSummary(client1,price1,priceDiscount1);
        printService.printSummary(client2,price2,priceDiscount2);
    }
}
