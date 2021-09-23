package object.zad1.model;

import java.util.Objects;

public record Computer(String producer, int model) {

    @Override
    public String toString() {
        return producer + " " + model;
    }
}

