package overloadingomethodsandthis.zad2.model;

import java.util.Random;

public class Dice {

    private int value;

    public Dice() {
        roll();
    }

    public Dice(int value) {
        if (0 >= value || value >= 7) {
            throw new IllegalArgumentException("The value must be between 1 and 6.");
        }
        this.value = value;
    }

    public void roll() {
        Random random = new Random();
        value = random.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "Result of the throw: " + value;
    }
}
