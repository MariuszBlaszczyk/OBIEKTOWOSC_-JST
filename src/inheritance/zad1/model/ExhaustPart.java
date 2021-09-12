package inheritance.zad1.model;

import java.util.Objects;

public class ExhaustPart extends Part {

    private boolean europeanStandard;

    public ExhaustPart(int idNumber, String nameOfManufacturer, String model, String series, boolean europeanStandard) {
        super(idNumber, nameOfManufacturer, model, series);
        this.europeanStandard = europeanStandard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExhaustPart that = (ExhaustPart) o;
        return europeanStandard == that.europeanStandard;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), europeanStandard);
    }

    @Override
    public String toString() {
        return "ExhaustPart\n" +
                super.toString() +
                "- european standard: " + europeanStandard;

    }
}
