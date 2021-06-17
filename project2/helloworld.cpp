
// masz zrobić program do obliczania pola i obwodu.
// program ma wyświetlić menu i prosić o wybranie opcji
// w zależności od opcji program ma prosić o podanie jakichś długości (bok a, bok b, promień, wysokość, itd)
// i na koniec ma obliczyć i wyświetlić ile wynosi pole i obwód wybranej figury
// w programie, proszę wybierz opcję:
// 1. Kwadrat / prostokąt
// 2. Trojkat
// 3. Trapez
// 4. Koło
// Podaj opcję: ...
// Wybrano opcję nr ... 
//  ..nazwa opcji..
// Podaj bok a:
// Podaj bok b:
// Pole powierzchni całkowitej:
// Obwód:


#include <iostream>

using namespace std;

int main()
{
    cout << "prosze wybierz opcje od 1 do 4" <<endl;
    cout << "1.kwadrat/prostokat" << endl;
    cout << "2.trojkat" <<endl;
    cout << "3.trapez" <<endl;
    cout << "4.kolo" <<endl;
    int choice;
    cin >> choice;

    cout << "wybrano opcje nr" << choice <<endl;

    switch(choice){
        case 1: 
        {
            cout << "podaj bok a" <<endl;
            double a;
            cin >>a;
            cout << "podaj bok b" <<endl;
            double b;
            cin >> b;
            cout << "Pole powierzchni calkowitej:";
            cout << a*b  << endl; 
            cout << "obwod:" ;
            cout << 2*(a+b) <<endl;
        }
            break;
        case 2:
        {
            
            cout << "podaj podstawe  a" <<endl;
            double a;
            cin >>a;
            cout << "podaj wysokosc h" <<endl;
            double h;
            cin >> h;
            cout << "Pole powierzchni calkowitej:";
            cout << 1/2*a*h  << endl; 
            cout << "podaj bok b:";
            double b;
            cin >> b;
            cout << endl << "podaj bok c";
            double c;
            cin >> c;
            cout << "obwod:" << endl;
            cout << a+b+c << endl;


            break;
        }   
        case 3:
        {
            
            cout << "podaj podstawe  a" << endl;
            double a;
            cin >>a; 
            cout << "podaj wysokosc h" << endl;
            double h;
            cin >> h;
            cout << "podaj podstawe  b" << endl;
            double b;
            cin >> b;
            cout << "Pole powierzchni calkowitej:";
            cout << (a+b)*h/2  << endl; 
            cout << "obwod:" << 2*(a+b) << endl;
            break;         
            }
        case 4:
           {
            cout << "podaj promien r" << endl;
            double r;
            cin >>r; 
            cout << "pole powierzchni calkowitej:" << 3.14159*r*r << endl;
            cout << "obwod:" << 3.14159*2*r << endl;
            break;
           }
        default:
            cout << "niestety nie moge ci pomoc";
    }


}