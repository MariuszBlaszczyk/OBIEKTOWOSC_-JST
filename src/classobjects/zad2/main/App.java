package classobjects.zad2.main;


import classobjects.zad2.model.Plant;
import classobjects.zad2.model.WaterConsumption;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        List<Plant> plants = new ArrayList<>();

        Plant plant1 = new Plant("Paprotka", "należy do rodziny paprotkowatych", 2.5);
        plants.add(plant1);
        Plant plant2 = new Plant("Nasturcja", " należy do rodziny nasturcjowatych", 3.2);
        plants.add(plant2);
        Plant plant3 = new Plant("Koniczyna", "należy do rodziny bobowatych", 0.7);
        plants.add(plant3);
        Plant plant4 = new Plant("Begonia", " należy do rodziny begoniowatych", 0.5);
        plants.add(plant4);
        Plant plant5 = new Plant("Storczyk", "roślina z grupy okrytozalążkowych ", 1.3);
        plants.add(plant5);

        double daily = 0;
        for (int i = 0; i < plants.size(); i++) {
            daily += plants.get(i).getDailyWaterConsumption();
        }

        System.out.println("Daily: " + daily);
        System.out.println("Weekly: " + WaterConsumption.weekly(daily));
        System.out.println("Yearly: " + WaterConsumption.yearly(daily));


    }
}
