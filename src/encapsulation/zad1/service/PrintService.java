package encapsulation.zad1.service;

import encapsulation.zad1.logic.Client;

public class PrintService {

    public void printSummary(Client client, double originalPrice, double discountPrice) {
        extracted(client);
        extracted(originalPrice, discountPrice);
    }


    private void extracted(Client client) {
        if (client.getFirstName() != null && client.getLastName() == null) {
            System.out.println("Witaj " + client.getFirstName());
        } else if (client.getFirstName() != null && client.getLastName() != null) {
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        } else if (client.getFirstName() == null && client.getLastName() != null) {
            System.out.println("Dzień dobry panie/pani " + client.getLastName());
        } else {
            System.out.println("Witaj nieznajomy");
        }
    }

    private void extracted(double originalPrice, double discountPrice) {
        System.out.println("Kwota przed rabatem: " + originalPrice);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice);
    }

}




