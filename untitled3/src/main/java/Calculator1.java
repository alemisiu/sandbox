public class Calculator1 {
    double add(double a,double b) {
        return a + b;
    }
    double add(double a, double b, double c) {
        return add(a, b) + c;
    }
    double substract(double a, double b) {
        return a-b;
    }
    double substract (double a, double b, double c) {
        return substract (a,b) -c;
    }

}
