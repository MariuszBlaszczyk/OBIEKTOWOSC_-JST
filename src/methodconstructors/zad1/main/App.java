package methodconstructors.zad1.main;

import methodconstructors.zad1.service.Calc;
import methodconstructors.zad1.service.Calculator;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        LinkedList<Double> numbers = new LinkedList<>();


        double a = 1.5;
        double b = 3.8;
        double c = 7.6;
        int x = 7;
        int y = 7;

        System.out.println("A + B = " + calculator.add(a, b));
        System.out.println("A + B + C = " + calculator.add(a, b, c));

        System.out.println("A - B = " + calculator.subtract(a, b));
        System.out.println("C - B - A = " + calculator.subtract(c, b, a));

        System.out.println("A * B = " + calculator.multiply(a, b));
        System.out.println("A * B * C = " + calculator.multiply(a, b, c));

        System.out.println("C / B = " + calculator.divide(c, b));
        System.out.println("C / B / A = " + calculator.divide(c, b, a));


        System.out.println(calculator.onePlusOne());

        System.out.println(calculator.addGeneric(x, a));

    }
}
