package overloadingomethodsandthis.zad1.service;

public class Calculator {

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return add(add(number1, number2), number3);
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static int subtract(int number1, int number2, int number3) {
        return subtract(subtract(number1, number2), number3);
    }

}
