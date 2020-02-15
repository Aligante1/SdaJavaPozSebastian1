package zajecia14grudnia;

import java.util.Scanner;

public class Czytnikintro {
    public static void main(String[] args) {
        //aby moc czytac dane od uzytkownika musimy utworzyc obiekt typu Scanner wg nastepujace skladni:
        Scanner czytnik = new Scanner(System.in);

        //czytnik to zmienna/obiekt typu Scanner

        //wiek to zmienna typu int
        //w momencie pisania kodu nie wiemy ile konkretnie uzytkownik ma lat
        String imie;
        Double wiek = 0.00;
        System.out.println("Podaj swoje imie: ");
        imie =  czytnik.nextLine();
        System.out.println("Ile masz lat ? ");
        wiek = czytnik.nextDouble();
        System.out.println("Witaj " + imie + "! Masz: " + wiek + " lata");


    }

}
