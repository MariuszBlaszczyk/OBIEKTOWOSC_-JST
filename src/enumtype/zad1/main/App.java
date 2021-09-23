package enumtype.zad1.main;


import enumtype.zad1.service.PizzaService;


public class App {

    public static void main(String[] args) {


        System.out.println("----------------------BOOLEAN-------------------------------");
        PizzaService pizzaService1 = new PizzaService();
        pizzaService1.availablePizzasBoolean();
        pizzaService1.pizzaSelectionBoolean();


        System.out.println();


        System.out.println("------------------------STRING------------------------------");
        PizzaService pizzaService2 = new PizzaService();
        pizzaService2.availablePizzasString();
        pizzaService2.pizzaSelectionString();


    }
}
