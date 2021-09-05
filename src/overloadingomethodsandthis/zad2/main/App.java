package overloadingomethodsandthis.zad2.main;

import overloadingomethodsandthis.zad2.model.Dice;

public class App {

    public static void main(String[] args) {

        Dice dice = new Dice(1);
        System.out.println("Manual = " + dice);
        Dice dice3 = new Dice(6);
        System.out.println("Manual = " + dice3);
        dice.roll();
        System.out.println(dice);
        dice.roll();
        System.out.println(dice);
        dice.roll();
        System.out.println(dice);
        dice.roll();
        System.out.println(dice);

    }
}
