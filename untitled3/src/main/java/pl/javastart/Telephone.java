package pl.javastart;
public class Telephone {
    String brand;
    String model;
    int batteryCapacity;
    int chargeLevel;

    public Telephone(String brand, String model, int batteryCapacity, int chargeLevel){
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public int getChargeLevel(){
        return chargeLevel;
    }
    public void setChargeLevel(int chargeLevel){
        this.chargeLevel= chargeLevel;
    }
    public String getInfo(){
        return brand
                + " " +model
                +", bateria:"+ batteryCapacity+"mAh"
                +",poziom naładownia:"+ chargeLevel +"%";
    }

}
