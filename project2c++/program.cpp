#include <iostream>
// Napisz program, który:
// *do tablicy statycznej 20 elementowej wylosuje i wpisze liczby z zakresu 0-20.
// Stwórz funkcję LosujZZakresu() oraz InicjalizujTabliceLosowo()
// *znajdź wartość minimalną funkcją ZnajdzMinimumTablicy()
// *znajdź wartość maksymalną funkcją ZnajdzMaksimumTablicy()
// *wyznacz sumę wszystkich wartości tablicy funkcją SumaElementowTablicy
using namespace std;
int n[20];

int losujzzakresu()
{
  return rand() % 21;
}

int znajdzminimumtablicy()
{
  int result = n[0];
  for (int i = 1; i < 20; i++)
  {
    if (n[i] < result)
    {
      result = n[i];
    }
  }
  return result;
}

int znajdzmaksimumtablicy()
{
  int result = n[0];
  for (int i = 1; i < 20; i++)
  {
    if (n[i] > result)
    {
      result = n[i];
    }
  }
  return result;
}

int SumaElementowTablicy()
{
  int result = 0;
  for (int i = 0; i < 20; i++)
  {
    result = result + n[i];
  }

  return result;
}

void inicjalizujtablicelosowa()
{
  for (int i = 0; i < 20; i++)
  {
    int v1 = losujzzakresu();
    n[i] = v1;
  }
}

int main()
{

  inicjalizujtablicelosowa();

  for (int i = 0; i < 20; i++)
  {
    std::cout << i << " : " << n[i] << std::endl;
  }

  std::cout << "najmniejsza wartosc to: " << znajdzminimumtablicy() << endl;
  std::cout << "najwieksza wartosc to: " << znajdzmaksimumtablicy() << endl;
  std::cout << "SumaElementowTablicy: " << SumaElementowTablicy() << endl;
  return 0;
}