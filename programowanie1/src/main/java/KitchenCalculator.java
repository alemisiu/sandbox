public class KitchenCalculator {
    public static void main(String[] args) {
        double waterGlasses = 2;
        double oilSpoons = 2.5;
        double honeyTeaspoons = 4;

        double waterMl = KitchenUtils.glassesToMl(waterGlasses);
        double oilMl = KitchenUtils.spoonsToMl(oilSpoons);
        double honeyMl = KitchenUtils.teaspoonToMl(honeyTeaspoons);

        System.out.println("Do przepisu potrzebujesz:");
        System.out.println(waterGlasses + " szklanki, czyli " + waterMl + "ml wody");
        System.out.println(oilSpoons + " łyżek, czyli " + oilMl + "ml oleju");
        System.out.println(honeyTeaspoons + " łyżeczek, czyli " + honeyMl + "ml miodu");
    }
}