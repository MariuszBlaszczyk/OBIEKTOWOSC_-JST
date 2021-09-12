package inheritance.zad1.main;

import inheritance.zad1.model.ExhaustPart;
import inheritance.zad1.model.Tire;

public class App {

    public static void main(String[] args) {

        Tire tire1 = new Tire(999, "DĘBICA", "WINTER", "XTREME",
                15, 45);
        System.out.println(tire1 + "\n");
        Tire tire2 = new Tire(555, "MICHELIN", "2002", "XXL",
                18, 55);
        System.out.println(tire2 + "\n");

        ExhaustPart exhaustPart1 = new ExhaustPart(123, "VXC", "1.5",
                "ZOOM", true);
        System.out.println(exhaustPart1 + "\n");
        ExhaustPart exhaustPart2 = new ExhaustPart(789, "QWERT", "XGM",
                "BOX", false);
        System.out.println(exhaustPart2 + "\n");
    }
}
