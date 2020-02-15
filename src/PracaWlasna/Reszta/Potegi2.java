package PracaWlasna.Reszta;

import java.util.Scanner;

public class Potegi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();
        for (int i = 0; Math.pow(2,i) <= number; i++){
            System.out.println(Math.pow(2,i));

        }

    }
}
