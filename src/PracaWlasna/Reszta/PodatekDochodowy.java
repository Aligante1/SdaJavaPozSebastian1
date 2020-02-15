package PracaWlasna.Reszta;

import java.util.Scanner;

public class PodatekDochodowy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote: ");
        int kwota = scanner.nextInt();
        double podatek = (kwota * 0.18) - 556.02;
        double podatek2 = 14839.02 + ((kwota - 85528) * 0.32);
        if (kwota < 85528){
            System.out.println("Podatek dochodowy wynosi: " + podatek );
        } else if (kwota > 85528) {
            System.out.println("Podatek dochodowy wynosi: " + podatek2);
    }
    }

}
