package overloadingomethodsandthis.zad2.model;

import java.util.Random;

public class Dice {

    private int value;
    private static Random random = new Random();

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
        value = random.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "Result of the throw: " + value;
    }
}
