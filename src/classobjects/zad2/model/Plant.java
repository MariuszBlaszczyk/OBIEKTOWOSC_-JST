package classobjects.zad2.model;


import java.util.Objects;

public class Plant {

    private String name;
    private String description;
    private double dailyWaterConsumption;

    public Plant(String name, String description, double dailyWaterConsumption) {
        this.name = name;
        this.description = description;
        this.dailyWaterConsumption = dailyWaterConsumption;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getDailyWaterConsumption() {
        return dailyWaterConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.dailyWaterConsumption, dailyWaterConsumption) == 0 && Objects.equals(name, plant.name) && Objects.equals(description, plant.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dailyWaterConsumption);
    }

    @Override
    public String toString() {
        return "Plant - " +
                "name: " + name + " " +
                ", description: " + description + " " +
                ", dailyWaterConsumption: " + dailyWaterConsumption + ".";
    }
}
