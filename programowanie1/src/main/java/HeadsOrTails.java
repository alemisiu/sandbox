import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        final int obverse =1;
        final int reverse =0;
        System.out.println("wybierz jedna z dwoch opcji");
        System.out.println(obverse+" -orzel");
        System.out.println(reverse + "-reszka");

        Scanner input = new Scanner(System.in);
        int userChoice =input.nextInt();
        Random random = new Random();
        int flipResult = random.nextInt(2);

        if(userChoice == flipResult) {
            if (flipResult == obverse) {
                System.out.println("brawo , wypadl orzel i wygrywasz!");
            } else {
                System.out.println("Brawo,wypadla reszka i wygrywasz!");
            }
        }else{
            System.out.println("Niestety Twoj wybor byl bledny przegrywasz.");

            }
        }
    }


