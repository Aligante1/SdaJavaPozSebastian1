package PracaWlasna.Reszta;

import java.util.Scanner;

public class Trójkąt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok: ");
        int bok1 = scanner.nextInt();
        System.out.println("Podaj drugi bok: ");
        int bok2 = scanner.nextInt();
        System.out.println("Podaj trzeci bok: ");
        int bok3 = scanner.nextInt();

        if ( bok1 > 0 && bok2 > 0 && bok3 > 0 ){
            System.out.println("Jest to trójkąt prostokątny ");
        } else {
            System.out.println("Nie jest to trójkąt prostokątny ");

        }

    }
}
