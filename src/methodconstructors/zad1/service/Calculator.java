package methodconstructors.zad1.service;


public class Calculator implements Calc {

    @Override
    public double add(double... numbers) {
        double sum = 0;
        for (double value : numbers) {
            sum += value;
        }
        return sum;
    }

    @Override
    public double subtract(double... numbers) {
        double sum = 0;
        for (double value : numbers) {
            sum -= value;
        }
        return sum;
    }

    @Override
    public double multiply(double... numbers) {
        double sum = 1;
        for (double value : numbers) {
            sum *= value;
        }
        return sum;
    }

    @Override
    public double divide(double... numbers) {
        double sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum /= numbers[i];
        }
        return sum;
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public <T extends Number> double addGeneric(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }


}
