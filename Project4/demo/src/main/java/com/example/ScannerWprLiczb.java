package com.example;

import java.util.Scanner;
import java.util.Vector;

//Zadanie 4
//Wprowadzanie liczb z klawiatury
// Wejście to temat złożony (i mało 'algorytmiczny'), zajmiemy się nim może potem
//a na razie podaję najprostszy sposób wprowadzania pojedynczej liczby, proszę go zastosować
//.package scannerwprliczb;/*http://System.in - specjalny obiekt dla wejścia z okna konsoli – powiązany ze standardowym urządzeniem wejściowym.
// Żeby przeczytać przy jego pomocy musimy go utworzyć:new Scanner(System.in)
// Klasa Scanner czyta strumień wejściowy i dzieli go na tokeny, które są łańcuchami znaków oddzielonymi przez specjalne znaki (delimiters)
//– standardowo spacje (ale mogą to być znaki tabulacji albo nowego wiersza)
// */public class ScannerWprLiczb {public static void main(String[] args)
//{//tworzymy obiekt klasy ScannerScanner scanner = new Scanner(System.in);int liczba;
//System.out.print("Podaj liczbę całkowitą ");liczba = scanner.nextInt();
//pobieramy liczbę całkowitąSystem.out.println(liczba);  }//main
//classProszę wykorzystać powyższą klasę aby wpisać 10 liczb do wektora, następnie wyświetlić utworzony wektor.
public final class ScannerWprLiczb {

    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        Scanner scanner = new Scanner(System.in);
        int liczba;
        for (int i = 0; i < 10; i++) {
            System.out.print("podaj liczbe calkowita");
            liczba = scanner.nextInt();
            vec.add(liczba);

        }

        for (int o : vec) {
            System.out.println(o);
        }

    }
}
