package zajecia11stycznia;

import java.util.Scanner;

public class ArraysWstep {
    public static void main(String[] args) {
        // Intro
        int wiek = 10;
        int[] liczby = new int[10];
        liczby[0] = 25;
        liczby[4] = 100;

        int wartosc = liczby[4];
        System.out.println(liczby[0]);

        //ArrayIndexOutOfBoundsException
        System.out.println(liczby[9]);

        //Sprawdzanie dlugosci tablicy
        int dlugoscTablicy = liczby.length;
        System.out.println("Tablica ma dlugosc: " + dlugoscTablicy);
        String[] imiona =  {"Twoj Stary" , "Twoja Stary2"};
        System.out.println("Dlugosc tablicy to: " + imiona.length);
        //Wyswietlenie wszystkich elementow tablicy

        for (int i = 0; i < imiona.length; i++) {
            String name = imiona[i];
            System.out.println("Imie nr. " + i + "to: " + imiona[i]);
        }

            //Dynamiczne tworzenie tablicy
            System.out.println("Podaj rozmiar tablicy: ");
            Scanner scanner = new Scanner(System.in);
            int rozmiar = scanner.nextInt();
            int[] dynamicznaTablica = new int[rozmiar];

            System.out.println("Rozmiar dynamicznej tablicy" + dynamicznaTablica.length);

        }
    }

