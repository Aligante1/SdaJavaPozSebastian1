package zajecia11stycznia;

import java.util.Scanner;
// zadania 2 plik, zadanie 2
public class Zadania2 {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj dodatnia liczbe: ");
        int liczba = czytnik.nextInt();
        int licznik = 1 ;
        while (licznik <= liczba) {
            System.out.println(licznik);
            licznik += 2;
        }
            for (int i = 1; i <= liczba; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }

        }
    }

}
