package inheritance.zad3.main;

import inheritance.zad3.model.Apple;
import inheritance.zad3.model.AppleVariety;

public class App {

    public static void main(String[] args) {
        Apple apple1 = new Apple(67,"sadasdfsafda", AppleVariety.KOSZTELA );
        System.out.println(apple1);
        Apple apple2 = new Apple(83, "dasdasdas",AppleVariety.KOSZTELA);
        System.out.println(apple2);
    }
}
