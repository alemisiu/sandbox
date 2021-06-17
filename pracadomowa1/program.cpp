#include <cstring>
#include <iostream>
#include <fstream>
#include <string>
#include <sstream>

using namespace std;

struct DaneOsobowe
{
  string imie;
  string nazwisko;
  int wiek;
  char plec;
};

int main(void)
{

  fstream dataFile;
  dataFile.open("data.txt", ios::in);

  // fstream resultFile;
  // resultFile.open(".txt",ios::out);

  DaneOsobowe dane[100];

  bool firstLine = true;
  string line;
  int indexOfPerson = 0;
  while (getline(dataFile, line))
  {
    if (firstLine)
    {
      // ignorujemy bo pierwsza linia ma tylko ilość rekordów
    }
    else
    {
      // cout << line << endl;

      stringstream lineAsStream(line);
      string imie;
      lineAsStream >> imie;
      string nazwisko;
      lineAsStream >> nazwisko;
      char plec;
      lineAsStream >> plec;
      int wiek;
      lineAsStream >> wiek;

      dane[indexOfPerson].nazwisko = nazwisko;
      dane[indexOfPerson].imie = imie;
      dane[indexOfPerson].plec = plec;
      dane[indexOfPerson].wiek = wiek;

      indexOfPerson++;
    }

    firstLine = false;
  }

  while (true)
  {
    cout
        << "1.Wyświetl dane" << endl
        << "2.Ilość pacjentów w bazie " << endl
        << "3.dodaj nowego" << endl
        << "9.zakoncz program" << endl;
    int decision;
    cin >> decision;

    switch (decision)
    {
    case 1:
      break;
    case 9:
      return 0;
    default:
      break;
    }
  }

  // dane[0].imie = "Jan";
  // dane[0].nazwisko= "Kowalski";
  // dane[0].plec = 'M';
  // dane[0].wiek = 45;

  // dane[1].imie = "Adam";
  // dane[1].nazwisko= "Nowak";
  // dane[1].plec = 'M';
  // dane[1].wiek = 65;

  // cout << dane[0].imie << dane[0].nazwisko << dane[0].wiek << dane[0].plec << endl;
  // cout << dane[1].imie << dane[1].nazwisko << dane[1].wiek << dane[1].plec << endl;

  cout << endl
       << endl;
  return 0;
}