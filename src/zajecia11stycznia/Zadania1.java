package zajecia11stycznia;

import java.util.Scanner;

public class Zadania1 {
    public static void main(String[] args) {
        // zapytaj uzytkownika o dowolny napis
        // NP. "Sebastian"


        // Policz liczbe znakow (ze spacja i bez)
        // Na koncu wyswietl wynik
        // NP. "Długość napisu ..... ze spacjami wynosi: Wynik,
        // "Bez spacji ...."


        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj dowolny napis: ");
        String text = czytnik.nextLine();
        //zliczanie dlugosci napisu bez spacji
        int licznik = 0;
        for (int i = 0; i < text.length(); i++){
            //pobierz 1 znak
            char znak = text.charAt(i);
            System.out.println("Znak na pozycji: " + i + " to: " + znak);
            // jezli dany znak jest litera (czyli nie jest spacja), to go zliczamy
            if (znak != ' '){
                licznik++;
            }



        }
        System.out.println("Dlugosc tekstu (ze spacjami) to:  " + text.length());
        System.out.println("Dlugosc tekstu bez spacji to : " + licznik);
        System.out.println("Tekst malymi literami to : " + text.toLowerCase());
        System.out.println("Tekst duzymi literami to : " + text.toUpperCase());
}
}