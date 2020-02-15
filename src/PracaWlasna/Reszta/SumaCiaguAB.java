package PracaWlasna.Reszta;

import java.util.Scanner;

public class SumaCiaguAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int number1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbe: ");
        int number2 = scanner.nextInt();
        int suma = 0 ;
            for (int i = number1; i <= number2; i++) {
              suma += i;
            }
        System.out.println("Suma przedziału od a=4" + number1 + "do b=" + number2 +"wynosi: " + suma);

    }
}
