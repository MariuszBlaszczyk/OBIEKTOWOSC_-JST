package methodconstructors.zad1.service;

public class Calculator {

    public double add(double... numbers) {
        double sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public double subtract(double... numbers) {
        double sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum -= numbers[i];
        }
        return sum;
    }

    public double multiply(double... numbers) {
        double sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum *= numbers[i];
        }
        return sum;
    }

    public double divide(double... numbers) {
        double sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum /= numbers[i];
        }
        return sum;
    }
}
