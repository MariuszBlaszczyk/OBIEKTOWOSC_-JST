package methodconstructors.zad4.model;

import java.util.Objects;

public class Home {

    private double waterAmount;
    private double oilAmount;

    public Home(int waterAmount, int oilAmount) {
        this.waterAmount = waterAmount;
        this.oilAmount = oilAmount;
    }


    public String stateOfResources() {
        return "Quantity: water = " + waterAmount + " l, oil = " + oilAmount + " l.";
    }

    public void takeShower() {
        System.out.println("Taking a shower");
        if (waterAmount < 48) {
            System.out.println("The remaining amount of water is too low" + waterAmount);
        } else {
            waterAmount -= 48;
        }
    }

    public void takeBath() {
        System.out.println("Taking a bath");
        if (waterAmount < 86) {
            System.out.println("The remaining amount of water is too low" + waterAmount);
        } else {
            waterAmount -= 86;
        }
    }

    public void makeDinner() {
        System.out.println("Making a dinner");
        if (oilAmount < 0.1 && waterAmount < 4) {
            System.out.println("The remaining amount of water is too low" + waterAmount);
            System.out.println("The remaining amount of oil is too low" + oilAmount);
        } else {
            oilAmount -= 0.1;
            waterAmount -= 4;
        }
    }

    public void boilWater() {
        System.out.println("Boiling a water");
        if (oilAmount < 0.05 && waterAmount < 0.5) {
            System.out.println("The remaining amount of water is too low" + waterAmount);
            System.out.println("The remaining amount of oil is too low" + oilAmount);
        } else {
            oilAmount -= 0.05;
            waterAmount -= 0.5;
        }
    }

    public void watchTv(int hours) {
        System.out.print("Watching TV by ");
        if (hours < 1) {
            System.out.println("Enter the full time");
        } else if (oilAmount < 0.06) {
            System.out.println("The remaining amount of oil is too low" + oilAmount);
        } else if (hours == 1) {
            System.out.println(hours + " hour.");
            oilAmount -= 0.06;
        } else {
            System.out.println(hours + " hours.");
            oilAmount -= (hours * 0.06);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return waterAmount == home.waterAmount && oilAmount == home.oilAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(waterAmount, oilAmount);
    }

    @Override
    public String toString() {
        return "Quantity: water = " + waterAmount + " l, oil = " + oilAmount + " l.";
    }
}
