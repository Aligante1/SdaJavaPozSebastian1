package zajecia12stycznia;

import java.util.Scanner;

public class Funkcje1zadanie {

    static int countLastLetterInString(String text){
        //pobieram ostatnia litere w napisie
        text = text.toLowerCase();
        char lastLetter = text.charAt(text.length() - 1);
        int counter = 0;
        for (int i = 0; i < text.length(); i++){
            char litera= text.charAt(i);
            if(lastLetter == litera){

                //jezel ostatnia litera(lastLetter) zgadza sie z aktualna litera (litera)
                // to zwieksz licznik(counter)
                counter++;
            }
        }

        return counter;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolnt napis, a ja policze ilosc wystapien ostatnie litery: ");
       String napis = scanner.nextLine();

       //wywolujemy funkcje

        int liczbaWystapien = countLastLetterInString(napis);
        System.out.println("Ostatni litera w wyrazie wystapila " + liczbaWystapien + " razy");

    }
}
