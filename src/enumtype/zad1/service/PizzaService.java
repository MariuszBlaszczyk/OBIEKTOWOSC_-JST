package enumtype.zad1.service;

import enumtype.zad1.logic.PizzaBoolean;
import enumtype.zad1.logic.PizzaString;

import java.util.Scanner;

public class PizzaService {

    private Scanner scanner = new Scanner(System.in);

    public void availablePizzasBoolean() {
        for (PizzaBoolean pizzas : PizzaBoolean.values()) {
            System.out.println(pizzas);
        }
    }

    public void availablePizzasString() {
        for (PizzaString pizzas : PizzaString.values()) {
            System.out.println(pizzas);
        }
    }

    public void pizzaSelectionBoolean() {
        //zastanawiam się jak zrobić tutaj pętlę do while żeby podawał pizzę dopóki nie poda właściwej
        System.out.println("Which pizza do you choose:");
        PizzaBoolean pizzaB = PizzaBoolean.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Thank you for your pizza order - " + pizzaB.name());
    }

    public void pizzaSelectionString() {
        System.out.println("Which pizza do you choose:");
        PizzaString pizzaS = PizzaString.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Thank you for your pizza order - " + pizzaS.name());
    }
}
