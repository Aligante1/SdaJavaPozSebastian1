package PracaWlasna.Reszta;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wage: ");
        double waga = scanner.nextDouble();
        System.out.println("Podaj wzrost: ");
        double wzrost = scanner.nextDouble();
        double BMI = waga/Math.pow(wzrost, 2);
        if ( BMI < 25) {
            System.out.println("Waga prawidłowa ");
        } else if (BMI > 18.5) {
            System.out.println("Niedowaga ");
        } else if (BMI < 25) {
            System.out.println("Nadwaga ");
        }

    }
}
