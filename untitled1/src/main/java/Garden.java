public class Garden {
    public static void main(String[] args){
        Plant plant1 = new Plant();
        plant1.name = "Storczyk";
        plant1.description = "dwupedowy kolorowy kwiat";
        plant1.waterConsumption = 0.1;

        Plant plant2 = new Plant();
        plant2.name = "Fikus";
        plant2.description = "niskie drzewkoo, idealne na bonsai";
        plant2.waterConsumption = 0.15;

        Plant plant3 = new Plant();
        plant3.name ="monstera";
        plant3.description = "zielona roslina,ktora nadaje charakter";
        plant3.waterConsumption = 0.3;

        double dailyWaterConsumption = plant1.waterConsumption +
                plant2.waterConsumption +
                plant3.waterConsumption;
        double weeklyWaterConsumption = dailyWaterConsumption * 7;
        double yearlyWaterConsumption = dailyWaterConsumption * 365;

        System.out.println("dzienne zapotrzebowanie na wode:" +dailyWaterConsumption + "I");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: " + weeklyWaterConsumption + "l");
        System.out.println("Roczne zapotrzebowanie na wodę: " + yearlyWaterConsumption + "l");
    }
}
