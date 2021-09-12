package inheritance.zad1.model;

import java.util.Objects;

public class Part {

    private int idNumber;
    private String nameOfManufacturer;
    private String model;
    private String series;

    public Part(int idNumber, String nameOfManufacturer, String model, String series) {
        this.idNumber = idNumber;
        this.nameOfManufacturer = nameOfManufacturer;
        this.model = model;
        this.series = series;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Part part = (Part) o;
        return idNumber == part.idNumber && Objects.equals(nameOfManufacturer, part.nameOfManufacturer) && Objects.equals(model, part.model) && Objects.equals(series, part.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber, nameOfManufacturer, model, series);
    }

    @Override
    public String toString() {
        return "- id: " + getIdNumber() + "\n" +
                "- name of manufacturer: " + getNameOfManufacturer() + "\n" +
                "- model: " + getModel() + "\n" +
                "- series: " + getSeries() + "\n";
    }
}
