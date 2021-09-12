package methodconstructors.zad1.main;

import methodconstructors.zad1.service.GenericCalculator;

public class GenericApp {

    public static void main(String[] args) {

        GenericCalculator<Integer> intCalc = new GenericCalculator<>();
        GenericCalculator<Double> doubleCalc = new GenericCalculator<>();

        System.out.println(intCalc.add(3, 2));
        System.out.println(intCalc.subtract(3, 2));
        System.out.println(doubleCalc.add(2.0, 1.0));
        System.out.println(doubleCalc.subtract(2.0, 1.0));


    }
}
