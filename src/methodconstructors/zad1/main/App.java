package methodconstructors.zad1.main;

import methodconstructors.zad1.logic.Calculator;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double a = 1.5;
        double b = 3.8;
        double c = 7.6;

        System.out.println("A + B = " + calculator.add(a, b));
        System.out.println("A + B + C = " + calculator.add(a, b,c));

        System.out.println("A - B = " + calculator.subtract(a,b));
        System.out.println("C - B - A = " + calculator.subtract(c,b,a));

        System.out.println("A * B = " + calculator.multiply(a,b));
        System.out.println("A * B * C = " + calculator.multiply(a,b,c));

        System.out.println("C / B = " + calculator.divide(c,b));
        System.out.println("C / B / A = " + calculator.divide(c,b,a));

    }
}
