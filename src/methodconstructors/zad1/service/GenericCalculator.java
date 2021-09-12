package methodconstructors.zad1.service;


public class GenericCalculator<T extends Number> {


    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }


}
