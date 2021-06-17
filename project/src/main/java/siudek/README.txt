Zadanie 2 Wstawianie

Prostym a użytecznym algorytmem jest wstawianie elementu w ciąg posortowanych.
Rozsądnie jest założyć, że do przechowywania danych wykorzystujemy tylko część (początek) wektora (reszta jest wypełniona np. zerami).
Wygodnie jest też przechowywać informację, który element jest ostatnim z pamiętanych (końcówka wektora to rezerwa na nowe).

Proszę zatem stworzyć algorytm dopisywania nowego elementu, z zachowniem posortowania.


Można to robić na różne sposoby, np. znaleźć miejsce w które mamy wstawić element i przesunąć do góry wszystkie pozostałe albo szukać od góry i od razu przesuwać.
Można też dopisać na końcu i wszystko posortować - ale to jest zbyt głupie (nieefektywne) więc proszę tak nie robić.

Testując ten program trzeba zwrócić uwagę na przypadki szczególne:
1. Dopisywany element jest mniejszy od najmniejszego (tu można zastosować metodę z wartownikiem)
2. Dopisywany element jest większy od największego
3. Jest wiele elementów jednakowych

Wstawiany element można podawać z klawiatury ale nie jest to konieczne, tym elementem zajmiemy się niedługo.


Przykładowy początek programu - proszę go uzupełnić

class Dopisz {

public static void main (String Args[]) {
int ilw = 15; //długość wektora
int ilwyk = 10; //tu pamiętamy jaka część wektora jest wykorzystana
//ta deklaracja jest niekonieczna - długość wektora jest określana przez
//ilość elementów podstawianych
int[] wek = {6,8,11,14,14,18,46,59,88,97,0,0,0,0,0};
int liczba_dopisywana = 12; //tu testujemy różne liczby

//tutaj dopisujemy kod wstawiania
...
}//main
}//Dopisz