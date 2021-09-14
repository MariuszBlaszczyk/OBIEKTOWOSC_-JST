package inheritance.zad3.model;

import java.util.Objects;

public class Fruit {

    private int weightInGrams;
    private String typeOfFruit;

    public Fruit(int weightInGrams, String typeOfFruit) {
        this.weightInGrams = weightInGrams;
        this.typeOfFruit = typeOfFruit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return weightInGrams == fruit.weightInGrams && typeOfFruit == fruit.typeOfFruit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightInGrams, typeOfFruit);
    }

    @Override
    public String toString() {
        return "- weight in grams: " + weightInGrams + "g\n" +
                "- type of fruit: " + typeOfFruit;
    }
}
