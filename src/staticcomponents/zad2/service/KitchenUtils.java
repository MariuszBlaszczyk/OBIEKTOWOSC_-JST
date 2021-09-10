package staticcomponents.zad2.service;

public class KitchenUtils {

    static final double GLASS_TO_ML = 250;
    static final double SPOON_TO_ML = 15;
    static final double TEASPOON_TO_ML = 5;

    public static double glassesToMl(double glass) {
        return glass * GLASS_TO_ML;
    }

    public static double spoonsToMl(double tablespoon) {
        return tablespoon * SPOON_TO_ML;
    }

    public static double teaspoonToMl(double teaspoon) {
        return teaspoon * TEASPOON_TO_ML;
    }
}
