package PracaWlasna.Reszta;

import java.util.Scanner;

public class SklepAGD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cene: ");
        int price = scanner.nextInt();
        if (price >= 100 && price <= 10000) {
            System.out.println("Prawidlowa cena ");
        } else {
            System.out.println("Zła cena ");
            scanner.nextInt();
        }
        System.out.println("Podaj liczbe rat: ");
        int raty = scanner.nextInt();
        if (raty >= 6 && raty <= 48) {
            System.out.println("Prawidłowa liczba rat");

        } else {
            System.out.println("Zła liczba rat");
            scanner.nextInt();

        }

        if (raty >= 6 && raty <= 12) {
            System.out.println("Twoja miesieczna rata wynosi: " + (price + (price * 0.025)) / raty);
        } else if (raty >= 13 && raty <= 24) {
            System.out.println("Twoja miesieczna rata wynosi: " + (price + (price * 0.05)) / raty);
        } else if (raty >= 25 && raty <= 48) {
            System.out.println("Twoja miesieczna rata wynosi: " + (price + (price * 0.1)) / raty);


        }



    }
}
