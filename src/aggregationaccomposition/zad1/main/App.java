package aggregationaccomposition.zad1.main;

import aggregationaccomposition.zad1.model.Address;
import aggregationaccomposition.zad1.model.BankAccount;
import aggregationaccomposition.zad1.model.Credit;
import aggregationaccomposition.zad1.model.Person;

public class App {

    Person person1 = new Person("Jan", "Kowalski", "90897812362", registeredAddressPerson1, residenceAddressPerson1);
    Address registeredAddressPerson1 = new Address("Warszawa", "Wiejska", "7c", "-", "22-200");
    Address residenceAddressPerson1 = registeredAddressPerson1;

    Person person2 = new Person("Marek", "Nowak", "89033019403", registeredAddressPerson2, residenceAddressPerson2);
    Address registeredAddressPerson2 = new Address("Poznań", "Wielka", "13", "2", "33-300");
    Address residenceAddressPerson2 = residenceAddressPerson1;

    BankAccount account1 = new BankAccount(person1, 10_000);

    Credit credit1 = new Credit(person1, 2000, 100, 0.05, 12);


}
