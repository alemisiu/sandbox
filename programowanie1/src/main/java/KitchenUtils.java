public class KitchenUtils {
    static final double GLASS_TO_ML = 250;
    static final double SPOON_TO_ML = 15;
    static final double TEASPOON_TO_ML = 5;

    static double glassesToMl(double glasses) {
        return glasses * GLASS_TO_ML;
    }

    static double spoonsToMl(double spoons) {
        return spoons * SPOON_TO_ML;
    }

    static double teaspoonToMl(double teaspoons) {
        return teaspoons * TEASPOON_TO_ML;
    }
}
