package PracaWlasna.Reszta;

import java.util.Random;
import java.util.Scanner;

public class LosowaLiczba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od 0 do 9: ");
        int number = scanner.nextInt();
        Random r = new Random();
        int results  = r.nextInt(10);
        if ( number == results) {
            System.out.println("Brawo, trafiles!");


        } else {
            System.out.println("Porażka");
        }





    }

}
