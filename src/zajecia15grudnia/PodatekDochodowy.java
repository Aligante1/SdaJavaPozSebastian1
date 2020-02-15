package zajecia15grudnia;

import java.util.Scanner;

public class PodatekDochodowy {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj swoj dochod: ");
        double dochod = czytnik.nextDouble();
        final double PROG_PODATKOWY = 85528;
        if (dochod < PROG_PODATKOWY) {
            System.out.println("Twoj podatek wynosi: " + ((dochod * 0.18) - 556.02));
        } else {
            System.out.println("Twoj podatek wynosi: " + (14839.02 + ((dochod - PROG_PODATKOWY) * 0.32)));

        }
    }
}
