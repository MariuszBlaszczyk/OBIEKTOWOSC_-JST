package aggregationaccomposition.zad1.main;

import aggregationaccomposition.zad1.model.Address;
import aggregationaccomposition.zad1.model.BankAccount;
import aggregationaccomposition.zad1.model.Credit;
import aggregationaccomposition.zad1.model.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Address registeredAddressPerson1 = new Address("Warszawa", "Wiejska", "7c", "-",
                "22-200");
        Address residenceAddressPerson1 = registeredAddressPerson1;
        Person person1 = new Person("Jan", "Kowalski", "90897812362",
                registeredAddressPerson1, residenceAddressPerson1);
        BankAccount accountPerson1 = new BankAccount(person1, new BigDecimal("10000"));
        Credit creditPerson1 = new Credit(person1, new BigDecimal("2000"), new BigDecimal("100"),
                new BigDecimal("0.05"), 12);
        persons.add(person1);


        Address registeredAddressPerson2 = new Address("Poznań", "Wielka", "13", "2",
                "33-300");
        Address residenceAddressPerson2 = residenceAddressPerson1;
        Person person2 = new Person("Marek", "Nowak", "89033019403",
                registeredAddressPerson2, residenceAddressPerson2);
        BankAccount accountPerson2 = new BankAccount(person2, new BigDecimal("7500"));
        Credit creditPerson2 = new Credit(person2, new BigDecimal("4500"), new BigDecimal("250"),
                new BigDecimal("0.08"), 24);
        persons.add(person2);


        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Name: " + persons.get(i).getFirstName() + " " +
                    persons.get(i).getLastName() + ", city: " + persons.get(i).getResidenceAddress().getCity() + "\n");
        }
    }
}
