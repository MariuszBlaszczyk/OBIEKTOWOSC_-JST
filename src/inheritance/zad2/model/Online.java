package inheritance.zad2.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Online extends Course {

    private int numberOfMinutesOfVideo;
    private int estimatedTimeForCompletion;

    public Online(String id, String name, BigDecimal price, String description, int numberOfMinutesOfVideo,
                  int estimatedTimeForCompletion) {
        super(id, name, price, description);
        this.numberOfMinutesOfVideo = numberOfMinutesOfVideo;
        this.estimatedTimeForCompletion = estimatedTimeForCompletion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Online online = (Online) o;
        return numberOfMinutesOfVideo == online.numberOfMinutesOfVideo && estimatedTimeForCompletion == online.estimatedTimeForCompletion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfMinutesOfVideo, estimatedTimeForCompletion);
    }

    @Override
    public String toString() {
        return "Online course\n" +
                super.toString() + "\n" +
                "- number of minutes of video: " + numberOfMinutesOfVideo + " min.\n" +
                "- estimated time for completion: " + estimatedTimeForCompletion + " min.\n";
    }
}
