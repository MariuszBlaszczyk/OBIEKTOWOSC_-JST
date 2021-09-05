package aggregationaccomposition.zad1.main;

import aggregationaccomposition.zad1.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();


        Person person1 = new Person("Jan", "Kowalski", "90897812362");
        Address registeredAddressPerson1 = new Address("Warszawa", "Wiejska", "7c", "-",
                "22-200");
        Address residenceAddressPerson1 = registeredAddressPerson1;
        BankAccount accountPerson1 = new BankAccount(new BigDecimal("10000"));
        Credit creditPerson1 = new Credit(new BigDecimal("2000"), new BigDecimal("100"),
                new BigDecimal("0.05"), 12);
        Client client1 = new Client(person1, registeredAddressPerson1, residenceAddressPerson1, accountPerson1, creditPerson1);
        clients.add(client1);


        Person person2 = new Person("Marek", "Nowak", "89033019403");
        Address registeredAddressPerson2 = new Address("Poznań", "Wielka", "13", "2",
                "33-300");
        Address residenceAddressPerson2 = residenceAddressPerson1;
        BankAccount accountPerson2 = new BankAccount(new BigDecimal("7500"));
        Credit creditPerson2 = new Credit(new BigDecimal("4500"), new BigDecimal("250"),
                new BigDecimal("0.08"), 24);
        Client client2 = new Client(person2, registeredAddressPerson2, residenceAddressPerson2, accountPerson2, creditPerson2);
        clients.add(client2);


//        for (int i = 0; i < clients.size(); i++) {
//            System.out.println("Name: " + clients.get(i).getClient().getFirstName() + " " +
//                    clients.get(i).getClient().getLastName() +
//                    ", city: " + clients.get(i).getResidenceAddress().getCity() +
//                    ", balance: " + clients.get(i).getBankAccount().getBalance() + ".\n");
//        }

        int clientCounter = 1;
        for (Client client : clients) {
            System.out.println("Client nr " + clientCounter);
            client.getClientDetails();
            clientCounter++;
        }


    }
}
