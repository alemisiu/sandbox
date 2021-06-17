
// Zadanie 9 
// Sortowanie przez proste wstawianie

// Przypomnijmy sobie słowny opis (dla przykładowego sortowania kart, gdzie często ten algorytm się stosuje):

// 1. Porównujemy 1 kartę z drugą i zamieniamy je miejscami, tak aby najmłodsza (lub najstarsza – jak wolimy) była na początku
// 2. Trzecią kartę wstawiamy w odpowiednie miejsce – na początku, pomiędzy pierwszą a drugą lub pozostawiamy tam gdzie jest
// 3. Szukamy właściwego miejsca dla kolejnej karty – przeglądając fragment już ułożony – wstawiamy ją pomiędzy inne. Powtarzamy tę operację dla wszystkich pozostałych kart

// Proszę pamiętać o przypadku gdy wstawiamy przed pierwszy element - tu łatwo popełnić błąd ale też można się wykazać pomysłowością stosując wartownika.

// Algorytm prostego wstawiania jest STABILNY (elementy o równej wartości będą występowały, po posortowaniu, w takiej samej kolejności jaką miały w zbiorze nieposortowanym). Proszę zwrócić uwagę na tę jego unikalną cechę; jest to czasem ważne a większość praktycznie stosowanych, szybszych algorytmów (w szczególności Quicksort) jest niestabilna.

public class Project6 {

  public static void main(String[] args) {
    int[] unsorted = { 10, 500, -1, 2, 13 };
    int[] sorted = new int[unsorted.length];

    sorted[0] = unsorted[0];
    for (int i = 1; i < unsorted.length; i++) {

      int current = unsorted[i];
      for (int j = i; j >= 0; j--) {

        if (j == 0) {
          sorted[0] = current;
          break;
        }
        if (sorted[j - 1] < current) {
          sorted[j] = current;
          break;
        }

        sorted[j] = sorted[j - 1];

      }
    }

    for (int i : sorted) {
      System.out.println(i);
    }
  }
}
