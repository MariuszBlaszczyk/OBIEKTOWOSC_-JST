package polymorphism.zad1.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Doctor extends Person {

    private BigDecimal bonus;

    public Doctor(String firstName, String lastName, BigDecimal salary, BigDecimal bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public String getInfo() {
        return "Doctor:\n" +
                super.getInfo() + "\n" +
                "- bonus: " + bonus + "PLN";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(bonus, doctor.bonus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return "Doctor:\n" +
                super.toString() + "\n" +
                "- bonus: " + bonus + "PLN";
    }
}
