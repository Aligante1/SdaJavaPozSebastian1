package PracaWlasna.Reszta;

import java.util.Scanner;

public class PoleProstokata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok: ");
        double bok1 = scanner.nextDouble();
        System.out.println("Podaj drugi bok: ");
        double bok2 = scanner.nextDouble();

        System.out.println("Wynik: " + bok1*bok2);


    }
}
