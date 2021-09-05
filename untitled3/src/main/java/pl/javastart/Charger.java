package pl.javastart;

public class Charger {
    public void charge(Telephone telephone) {
        int currentCharge = telephone.getChargeLevel();
        telephone.setChargeLevel(currentCharge + 1);
    }
}