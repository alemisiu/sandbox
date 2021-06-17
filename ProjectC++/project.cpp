// Program, który losuje liczby i sortuje je rosnąco i malejąco.
// Zakres losowanych liczb podany przez użytkownika na początku pracy programu.
// Ilość losowanych liczb: 300 (niezmiennie)
// Funkcja programu (losowanie rosnące / malejące) zaimplementowana jako "switch".
// Tryb sortowania wybiera użytkownik (rosnące / malejące)
// Program wykrzysujacy tablice statyczne
#include <cstdlib>
#include <ctime>
#include <iostream>

using namespace std;

int main()
{
  srand((unsigned)time(0));

  cout << "podaj dolna wartosc z zakresu losowania liczb :";
  int m;
  cin >> m;

  cout << "\npodaj gorna wartosc z zakresu losowania liczb :";
  int n;
  cin >> n;

  cout << "\nwybierz 1 w przypadku sortowania rosnacego  lub 0 w przypadku malejacego";
  bool ascending;
  cin >> ascending;

  int count = 300;
  int arr[count] = {};

  for (int i = 0; i < count; i++)
  {
    int o = rand() % (n - m + 1) + m;
    arr[i] = o;
  }

  for (int i = 0; i < count; i++)
  {
    for (int j = i + 1; j < count; j++)
    {
      if ((ascending && arr[i] > arr[j]) || (!ascending && arr[i] < arr[j]))
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }

  for (int i = 0; i < count; i++)
  {
    cout << arr[i] << endl;
  }

  cout << "\n";
}