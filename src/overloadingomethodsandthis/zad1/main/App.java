package overloadingomethodsandthis.zad1.main;

import overloadingomethodsandthis.zad1.service.Calculator;

public class App {

    public static void main(String[] args) {

        int number1 = 35;
        int number2 = 27;
        int number3 = 7;

        System.out.println("Number1 " + number1 + ", number2 " + number2 + ", number3 " + number3 + ".");

        System.out.println("Number1 + number2 = " + Calculator.add(number1, number2));
        System.out.println("Number1 + number2 + number3 = " + Calculator.add(number1, number2, number3));

        System.out.println("Number1 - number2 = " + Calculator.subtract(number1, number2));
        System.out.println("Number1 - number2 - number3 = " + Calculator.subtract(number1, number2, number3));
    }
}
