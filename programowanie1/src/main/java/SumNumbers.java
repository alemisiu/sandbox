
import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj ile liczb chcesz zsumowac:");
        int numbers = sc.nextInt();

        int sum = 0;
        while (numbers-- > 0) {
            System.out.println("podaj kolejna liczba :");
            sum = sum + sc.nextInt();

        }
        System.out.println("Suma wszystkich podnaych liczb to:" + sum);
        sc.close();
    }
}
