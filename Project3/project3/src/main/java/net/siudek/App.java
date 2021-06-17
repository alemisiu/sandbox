package net.siudek;
// Zadanie 3 generowanie liczb losowych w wektorze

// Przydatnym mechanizmem programisytcznym są generatory liczb losowych.
// Proszę poczytać sobie o ich teorii np. https://pl.wikipedia.org/wiki/Generator_liczb_losowych

// W językach progamowania zazwyczaj generowanie liczb losowych jest jedną ze standardowych procedur (metod);
// w Java może to wyglądać tak (choć są inne sposoby):

// //generuje wektor 10-elementowy z liczb od 0 do 99
// //(int) 'rzutuje' wygenerowany (i pomnożony przez 100) ułamek na zmienną //całkowitą
// ilw=10;
// for (i=0;i<ilw;i++)
//       wek[i]=(int)(100*Math.random());


// Często do testowania potrzebne są nam liczby losowe uporządkowane (rosnące lub malejące).
// Można oczywiście posortować wygenerowany wcześniej wektor liczb losowych ale to jest czasochłonne.
//Istniej inna, prosta metoda: możemy losować niewielkie liczby losowe (np. z przedziału 1-5) i dodawać je do wcześniej wylosowanych.
// W ten sposób otrzymamy szybko ciąg rosnących sum o zmiennym 'skoku', którego długość można łatwo regulować.
//Proszę zatem wygenerować w ten sposób ciąg przypadkowych, rosnących liczb w wektorze 100-elementowym.

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        int ilw=100;
        int[] wek = new int[ilw];
        for (int i=0 ; i<ilw ; i++) {
            if (i == 0) {
                int initial = (int)(5*Math.random()) +1;
                wek[0] = initial;
            } else {
                int step = (int)(5*Math.random()) +1;
                int j = i - 1;
                int previous = wek[j];
                wek[i] = previous +step;
            }


        }

        for(int it:wek){
            System.out.println(it);
        }

    }
}
