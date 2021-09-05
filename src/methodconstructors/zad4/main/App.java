package methodconstructors.zad4.main;

import methodconstructors.zad4.model.Home;

public class App {
    public static void main(String[] args) {

        Home home = new Home(10_000, 1000);
        System.out.println(home.stateOfResources());
        home.takeShower();
        System.out.println(home.stateOfResources());
        home.takeBath();
        System.out.println(home.stateOfResources());
        home.makeDinner();
        System.out.println(home.stateOfResources());
        home.watchTv(4);
        System.out.println(home.stateOfResources());
        home.boilWater();
        System.out.println(home.stateOfResources());
    }
}
