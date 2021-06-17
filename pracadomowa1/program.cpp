#include <iostream>
#include <cstring>

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
	DaneOsobowe dane[100];
	
	dane[0].imie = "Jan";
	dane[0].nazwisko= "Kowalski";
	dane[0].plec = 'M';
	dane[0].wiek = 45; 
	
	dane[1].imie = "Adam";
	dane[1].nazwisko= "Nowak";
	dane[1].plec = 'M';
	dane[1].wiek = 65; 	
	
	cout << dane[0].imie << dane[0].nazwisko << dane[0].wiek << dane[0].plec << endl;
	cout << dane[1].imie << dane[1].nazwisko << dane[1].wiek << dane[1].plec << endl;
	
	return 0;
}