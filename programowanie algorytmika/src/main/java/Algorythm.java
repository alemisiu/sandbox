import java.util.Scanner;

class Algorithm {
    public static void main(String[] args) {
        int multi = getMulti();
        printPositiveOrNegative(multi);
    }

    private static void printPositiveOrNegative(int multi) {
        if (multi >= 0) {
            System.out.println("Nieujemna");
        } else {
            System.out.println("Ujemna");
        }
    }

    private static int getMulti() {
        Scanner scanner = new Scanner(System.in);
        int multi = 1;
        for (int index = 0; index < 5; index++) {
            int next = scanner.nextInt();
            multi *= next;
        }
        return multi;
    }
}