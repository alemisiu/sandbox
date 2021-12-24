import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

class NumbersReader {
    public static void main(String[] args) {
        final String fileName = "numbers.txt";
        try (
                var fr = new FileReader(fileName);
                var br = new BufferedReader(fr);
        ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            BigInteger aBig = new BigInteger(br.readLine());
            BigInteger bBig = new BigInteger(br.readLine());
            System.out.println("a+b+c = " + (a + b + c));
            System.out.println("aBig+bBig = " + aBig.add(bBig));
        } catch (FileNotFoundException e) {
            System.err.println("nie znaleziono pliku");

        } catch (IOException e) {
            System.err.println("Błąd wczytu danych");
        }
    }
}

