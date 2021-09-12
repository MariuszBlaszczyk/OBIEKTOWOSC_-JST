package inheritance.zad3.main;

import inheritance.zad3.model.Apple;
import inheritance.zad3.model.AppleVariety;
import inheritance.zad3.model.TypeOfFruit;

public class App {

    public static void main(String[] args) {
        Apple apple1 = new Apple(67, TypeOfFruit.JABŁKOWATY, AppleVariety.LIGOL);
        System.out.println(apple1);
        Apple apple2 = new Apple(83, TypeOfFruit.JABŁKOWATY, AppleVariety.KOSZTELA);
        System.out.println(apple2);
    }
}
