class Vehicle{
    int passengers;
    int fuelcap;
    double 1km;

    int range(){
        return(int) (fuelcap / 1km * 100);
    }

    double fuelneeded(int km) {
        return (double) km /100 * 1km;
    }

}


public class project7 {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double liters;
        int dist =252;

        minivan.passengers =7;
        minivan.fuelcap = 65;
        minivan.1km = 9.1;

        sportscar.passengers =2;
        sportscar.fuelcap =55;
        sportscar.1km = 12.5;
        liters  = minivan.fuelneeded(dist);

        System.out.println("aby przejechac " + dist + "kilometrow, minivan potrzebuje" + liters + "litrow paliwa.");

        liters = sportscar.fuelneeded(dist);
        System.out.println("aby przejechac" + dist + "kilometrow, auto sportowe potrzebuje" + liters + "litrow paliwa");

    }
}
