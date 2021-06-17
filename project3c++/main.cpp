// Napisać program, który:

// *wczyta 4 liczby a,b,c,d
// *wyświetli menu z funkcjonalnościami (zdefiniowanymi poniżej) //funkcja

// *używając funkcji switch oraz definiując własne funkcje wykona poniższe czynności
// --wyświetli maksymalną wartość wprowadzonych liczb //funkcja
// --wyświetli minimalną wartość wprowadzonych liczb  //funkcja
// --policzy średnią				//funkcja
// --obliczy (a+b)/(c+d)				//funkcja
// --obiczy średnią ważoną z wagami 0.1, 0.2, 0.3, 0.4 odpowiednia dla a,b,c,d	//funkcja

// NIE DOTYCZY *program będzie dział

using namespace std;
#include <iostream>

int a, b, c, d;

int maxValue()
{
  int result = a;
  if (b > result)
    result = b;
  if (c > result)
    result = c;
  if (d > result)
    result = d;
  return result;
}

int minValue()
{
  int result = a;
  if (b < result)
    result = b;
  if (c < result)
    result = c;
  if (d < result)
    result = d;
  return result;
}

double averege()
{
  return (a + b + c + d) / 4.0;
}

double sum()
{
  return (a + b) / (double)(c + d);
}
double weightedAverage()
{
  // wiem że mianownik wynosik 1, ale zostawione dla czytelności zadania
  return (a * 0.1 + b * 0.2 + c * 0.3 + d * 0.4) / (0.1 + 0.2 + 0.3 + 0.4);
}

int main()
{
  cout << "Podaj liczby a,b,c,d:" << endl;
  cin >> a >> b >> c >> d;

  int menu;
  cout << "prosze wybrac opcje: " << endl;
  cout << "1.obliczenie maksymalnej wartosci: " << endl;
  cout << "2.obliczenie minimalnej wartosci: " << endl;
  cout << "3.policzy srednia: " << endl;
  cout << "4.obliczy (a+b) / (c+d): " << endl;
  cout << "5.obiczy średnią ważoną z wagami 0.1, 0.2, 0.3, 0.4 : " << endl;
  cout << " wybierz opcje 1 ,2,3,4,5 i nacisnij enter:" << endl;
  cin >> menu;

  switch (menu)
  {
  case 1:
    cout << "najwieksza wartosc to :" << maxValue() << endl;
    break;
  case 2:
    cout << " najmniejsza wartosc to : " << minValue() << endl;
    break;
  case 3:
    cout << " srednia :" << averege() << endl;
    break;
  case 4:
    cout << " oblicz (a+b) / (c+d):" << sum() << endl;
    break;
  case 5:
    cout << " oblicz srednia wazona :" << weightedAverage() << endl;
    break;
  default:
    cout << " nieznana opcja " << endl;
  }

  return 0;
}
