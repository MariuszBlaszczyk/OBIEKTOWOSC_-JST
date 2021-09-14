package inheritance.zad2.main;

import inheritance.zad2.model.Bootcamp;
import inheritance.zad2.model.Online;
import inheritance.zad2.model.Stationary;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        Stationary stationary = new Stationary("JAVA-STACJO-WRO-234", "JAVA'S", new BigDecimal("5000"),
                "Study in your city", "Kraków", 65);
        System.out.println(stationary);

        Online online = new Online("JAVA-ONLINE-123", "JAVA'O", new BigDecimal("10000"),
                "Learn at home", 168, 680);
        System.out.println(online);

        Bootcamp bootcamp = new Bootcamp("JAVA-ONLINE-BOOT-456", "JAVA'B", new BigDecimal("20000"),
                "Learn with us", 500, 1000,
                "Dominik Mazur", 100);
        System.out.println(bootcamp);

    }
}
