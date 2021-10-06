package app;

import calc.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double a = input.nextDouble();
        input.nextLine();
        String operator =input.nextLine();
        double b = input.nextDouble();

        Calculator calc = new Calculator();
        double result = calc.calculate(a,b,operator);
        System.out.println(a + operator + b +" = " + result);

        input.close();
    }
}
