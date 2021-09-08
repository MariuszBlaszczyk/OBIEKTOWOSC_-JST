package encapsulation.zad1.service;

import encapsulation.zad1.logic.Client;

public class DiscountService {

    public static double calculateDiscountPrice(Client client, double price) {
        if (client.isPremium())
            return calculatePremiumDiscount(price);
        else
            return calculateStandardDiscount(price);
    }

    private static double calculateStandardDiscount(double price) {
        if (price > 1000)
            return applyDiscount(price, 0.1);
        else
            return price;
    }

    private static double calculatePremiumDiscount(double price) {
        if (price > 1000)
            return applyDiscount(price, 0.15);
        else
            return applyDiscount(price, 0.05);
    }

    private static double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }
}
