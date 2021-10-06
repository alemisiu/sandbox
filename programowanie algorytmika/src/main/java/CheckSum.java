import java.util.Scanner;

class CheckSum {
    public static void main(String[] args) {
        int sum = 0;
//        int next = 0;
        Scanner scanner = new Scanner(System.in);
//        #1 pętla while
//        while((next = scanner.nextInt()) <= 100) {
//              sum += next;
//        }

//        #2 pętla do while
//        do {
//            next = scanner.nextInt();
//            if(next <= 100)
//                sum += next;
//        } while(next <= 100);

//        #3 pętla for
        for(int next = scanner.nextInt(); next <= 100; next = scanner.nextInt()) {
            sum += next;
        }

        int mod = sum % 2;
        if(mod == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }
}