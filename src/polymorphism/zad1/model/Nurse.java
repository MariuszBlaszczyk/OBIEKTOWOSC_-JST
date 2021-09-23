package polymorphism.zad1.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Nurse extends Person {

    private double overtime;

    public Nurse(String firstName, String lastName, BigDecimal salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public String getInfo() {
        return "Nurse:\n" +
                super.getInfo() + "\n" +
                "- overtime: " + overtime + "h";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Nurse nurse = (Nurse) o;
        return Double.compare(nurse.overtime, overtime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), overtime);
    }

    @Override
    public String toString() {
        return "Nurse:\n" +
                super.toString() + "\n" +
                "- overtime: " + overtime + "h";
    }
}
