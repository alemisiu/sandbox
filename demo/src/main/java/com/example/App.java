package com.example;
//Zadanie 7  - Sortowanie bąbelkowe (przez prostą zamianę).

// Przypomnijmy sobie słowny opis tego algorytmu:
// 1. Porównujemy pierwszy element z drugim i jeżeli drugi jest mniejszy – zamieniamy je miejscami (jeżeli jest większy nic nie robimy)
// 2. Powtarzamy tę operację dla elementu drugiego i trzeciego – aż do końca wektora.
// 3. Jeżeli nie dokonaliśmy żadnej zamiany – elementy są już uporządkowane
// jeżeli zrobiliśmy choć jedną – wracamy na początek wektora i porównujemy znów wszystkie pary elementów.
// Analizując dokładniej działanie powyższego algorytmu można zauważyć że każde przejście wewnętrznej pętli powoduje,
// że najmniejszy w danym momencie element przesuwa się na sam początek; nie trzeba zatem za każdym razem porównywać początkowych,
// już uporządkowanych elementów – można za każdym razem zaczynać zamiany trochę dalej.
// Spróbujcie napisać rówież taki ulepszony program i uruchomić go.

public final class App {

    public static void main(String[] args) {
        int[] elements = { 2, 6, 4, 1 };
        int numberOfElements = elements.length - 1;

        while (true) {
            boolean unchanged = true;
            for (int i = 0; i < numberOfElements; i++) {
                int i1 = elements[i];
                int i2 = elements[i + 1];
                if (i1 > i2) {
                    unchanged = false;
                    elements[i] = i2;
                    elements[i + 1] = i1;
                }
            }
            if (unchanged)
                break;
        }

        for (int x : elements) {
            System.out.println(x);
        }
    }
}
