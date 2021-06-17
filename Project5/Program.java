// Zadanie 8 -  Sortowanie przez proste wybieranie

// 1. Szukamy najmniejszego elementu 
// 2. Po znalezieniu zamieniamy go miejscami z pierwszym (chyba że ten pierwszy jest  właśnie najmniejszy)
// 3. Operację powtarzamy dla drugiego elementu itd.

public class Program {
  public static void main(String[] args) {

    int[] arr = { 10, 500, -1, 2, 13 };
    int numberOfElements = arr.length;

    for (int i = 0; i < numberOfElements - 1; i++) {

      int minValue = arr[i];
      for (int j = i + 1; j < numberOfElements; j++) {
        if (arr[j] < minValue) {
          minValue = arr[j];
          arr[j] = arr[i];
          arr[i] = minValue;

        }
      }

    }

    for (int it : arr) {
      System.out.println(it);
    }
  }
}