package zajecia11stycznia;

import java.util.Random;
import java.util.Scanner;

public class Arrays2zadanie {
    public static void main(String[] args) {
        //zadanie drugie, lista zajecia 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        //tworzymy dwie tablice
        // pierwsza liczby rozmiar podany przez uzytkownika
        // druga tablice wystapienie o rozmiarze 11 (dla zliczania wystapien od 0 do 10)
        int[] liczby = new int[size];
        int[] wystapienia = new int[11];

        // Wypelnic tablice liczby wartosciami losowymi
        Random rand = new Random();

        for (int i = 0; i < liczby.length; i++) {
            //losowanie liczby
            int losowaliczba = rand.nextInt(10) +1 ;
            liczby[i] = losowaliczba;

        }
        for (int i = 0; i < liczby.length; i++) {
            //losujemy liczbe
            int index = liczby[i];
            // wpisujemy wylosowana liczbe do tablicy
            wystapienia[index]++;
        }
    //mamy wypelniona talice liczby wiec ja wyswietlimy
        //uzyjemy petli foreach
        //nie mamy zmiennej int i czyli tracimy informacje o indeksie
        // ale w tym przypadku tego nie potrzebujmy
        // dla kazdego elementu chcemy go wypisac..

        for (int liczba : liczby) {
            System.out.print(liczba + ", ");
        }

        //zliczanie elementów

        for(int i = 0; i < liczby.length; i++){
            //pobierz wartosc z tablicy "liczby" ->> wartosc ta jest indeksem dla tablicy wystapienia
            //np. jezeli bedzie liczba 5 -> to w tablicy wystapienie [5] nalezy inkerementowac wartosc
         int index = liczby[i];
         wystapienia[index]++;
        }
        //wyswietlenie tablicy wystapienia
        for (int i = 0; i < wystapienia.length; i++) {
            System.out.println(i + " --->" + wystapienia[i]);

        }

    }
}

