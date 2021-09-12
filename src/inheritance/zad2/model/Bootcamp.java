package inheritance.zad2.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Bootcamp extends Course {


    private String coach;
    private int numberOfHoursOfConsultations;

    public Bootcamp(String id, String name, BigDecimal price, String description,
                    String coach, int numberOfHoursOfConsultations) {
        super(id, name, price, description);

        this.coach = coach;
        this.numberOfHoursOfConsultations = numberOfHoursOfConsultations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return  numberOfHoursOfConsultations == bootcamp.numberOfHoursOfConsultations && Objects.equals(coach, bootcamp.coach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coach, numberOfHoursOfConsultations);
    }

    @Override
    public String toString() {
        return "Bootcamp course\n" +
                super.toString() + "\n" +
                "- coach: " + coach + "\n" +
                "- number of hours of consultations:" + numberOfHoursOfConsultations;
    }
}
