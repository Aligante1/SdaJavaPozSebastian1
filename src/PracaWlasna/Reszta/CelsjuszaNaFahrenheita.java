package PracaWlasna.Reszta;

import java.util.Scanner;

public class CelsjuszaNaFahrenheita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopnie w Cesjuszach: ");
        double stopnie = scanner.nextDouble();

        System.out.println("Podaj stopnie w fahrenheirtach: ");
        double stopnie1 = scanner.nextDouble();
        double wynik2 = (stopnie1 - 32) / 1.8;
        System.out.println("stopnie celsjusza: " + wynik2);

        double wynik = (1.8 * stopnie) + 32;
        System.out.println("Stopnie fahrenheita: " + wynik);
    }
}
