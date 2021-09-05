package accessspecifiers.zad2.model;

import java.util.Objects;

public class Telephone {

    private String brand;
    private String model;
    private int batteryCapacity;
    private int chargeLevel;

    public Telephone(String brand, String model, int batteryCapacity, int chargeLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }


    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return batteryCapacity == telephone.batteryCapacity && chargeLevel == telephone.chargeLevel && Objects.equals(brand, telephone.brand) && Objects.equals(model, telephone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, batteryCapacity, chargeLevel);
    }

    @Override
    public String toString() {
        return "Telephone: " + brand
                + " " + model
                + ", battery: " + batteryCapacity + "mAh"
                + ", charge level: " + chargeLevel + "%";
    }
}
