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

DaneOsobowe dane[100];
int indexOfPerson = 0;

void printData()
{
  cout << endl;
  for (int i = 0; i < indexOfPerson; i++)
  {
    cout << dane[i].imie << " " << dane[i].nazwisko << " " << dane[i].wiek << " " << dane[i].plec << endl;
  }
  cout << endl;
}

void addNew()
{
  cout << "podaj dane pacjenta: " << endl;

  cout << "imie: " << endl;
  string firstName;
  cin >> firstName;

  cout << "nazwisko: " << endl;
  string surname;
  cin >> surname;

  cout << "wiek: " << endl;
  int age;
  cin >> age;

  cout << "plec: " << endl;
  char gender;
  cin >> gender;

  dane[indexOfPerson].imie = firstName;
  dane[indexOfPerson].nazwisko = surname;
  dane[indexOfPerson].wiek = age;
  dane[indexOfPerson].plec = gender;
  indexOfPerson++;
}

int main(void)
{

  fstream dataFile;
  dataFile.open("data.txt", ios::in);

  // fstream resultFile;
  // resultFile.open(".txt",ios::out);

  bool firstLine = true;
  string line;

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
        << endl
        << "1.Wyświetl dane" << endl
        << "2.Ilość pacjentów w bazie " << endl
        << "3.dodaj nowego" << endl
        << "9.zakoncz program" << endl
        << endl;
    int decision;
    cin >> decision;

    switch (decision)
    {
    case 1:
      printData();
      break;
    case 2:
      cout << "Ilość pacjentów w bazie wynosi :" << indexOfPerson << endl;
      break;
    case 3:
      addNew();
      break;
    case 9:
      return 0;
    default:
      break;
    }
  }

  cout << endl
       << endl;
  return 0;
}