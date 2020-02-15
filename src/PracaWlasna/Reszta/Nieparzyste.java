package PracaWlasna.Reszta;

import java.util.Scanner;

public class Nieparzyste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();
        for (int i = 1; i < number ; i += 2) {
            System.out.println(i);
        }
    }
}
