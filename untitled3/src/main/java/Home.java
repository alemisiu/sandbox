public class Home {
    double water;
    double fuel;

    Home(double w, double f){
        water =w;
        fuel =f;
    }

    void takeShower(){
        water = water-48;
    }

    void takeBath(){
        water =water -86;
    }
    void makeDinner(){
        water = water-4;
        fuel = fuel -0.1;
    }
    void boilWater(){
        water = water-0.5;
        fuel =fuel-0.05;
    }
    void watchTv(int hours){
        double fuelConsumption = hours *0.06;
        fuel = fuel - fuelConsumption;
    }
    String getStatus() {
        return "ilość wody:" +water + "litrow,ropa:" + fuel + "litrow";
    }
}
