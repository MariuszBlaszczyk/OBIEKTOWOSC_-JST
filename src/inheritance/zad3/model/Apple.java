package inheritance.zad3.model;

import java.util.Objects;

public class Apple extends  Fruit{

    private AppleVariety appleVariety;

    public Apple(int weightInGrams, TypeOfFruit typeOfFruit, AppleVariety appleVariety) {
        super(weightInGrams, typeOfFruit);
        this.appleVariety = appleVariety;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return appleVariety == apple.appleVariety;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), appleVariety);
    }

    @Override
    public String toString() {
        return "Apple\n" +
                super.toString() + "\n" +
                "- apple variety: " + appleVariety + "\n";
    }
}
