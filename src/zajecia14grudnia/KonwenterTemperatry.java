package zajecia14grudnia;

import java.util.Scanner;

public class KonwenterTemperatry {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);

        double stopnie = 0.00;
        double stopnie2 = 0.00;
        System.out.println("Podaj stopnie Celsjusza");
        stopnie = czytnik.nextDouble();
        System.out.println("Wynik w stopniach Fahrenheita " + (1.8*stopnie + 32));
        System.out.println("Podaj stopnie Fahremheita");
        stopnie2 = czytnik.nextDouble();
        System.out.println("Wynik w stopniach Celsjusza " + (stopnie2 - 32 * 1.8));

        double masa = 0.00;
        Double wzrost = 0.00;

        System.out.println("Podaj wage: ");
        masa = czytnik.nextDouble();
        System.out.println("Podaj wzrost: ");
        wzrost = czytnik.nextDouble();
        System.out.println("Twoje BMI wynosi: " + (masa/(wzrost*wzrost)));
        // potegowanie liczb
        Math.pow(3, 5);
        double bmi = 26.5;

        if (bmi  > 18.5 && bmi < 25 ){
            System.out.println("Waga OK - waga w normie");
        } else {
            System.out.println("Zly wynik - waga za duza badz za mala");
        }
    }


}
