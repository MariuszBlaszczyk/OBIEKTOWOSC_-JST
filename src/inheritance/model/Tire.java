package inheritance.model;

import java.util.Objects;

public class Tire extends Part {

    private int size;
    private double width;

    public Tire(int idNumber, String nameOfManufacturer, String model, String series, int size, double width) {
        super(idNumber, nameOfManufacturer, model, series);
        this.size = size;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tire tire = (Tire) o;
        return size == tire.size && Double.compare(tire.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, width);
    }

    @Override
    public String toString() {
        return "Tire: \n" +
                super.toString() +
                "- size: " + size + "\n" +
                "- width: " + width;
    }


}



