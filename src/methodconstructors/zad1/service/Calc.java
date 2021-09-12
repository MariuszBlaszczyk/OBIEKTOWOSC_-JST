package methodconstructors.zad1.service;

public interface Calc {

    double add(double... numbers);

    double subtract(double... numbers);

    double multiply(double... numbers);

    double divide(double... numbers);

    default double onePlusOne() {
        return 1 + 1;
    }

}
