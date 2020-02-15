package PracaWlasna.Reszta;

import java.util.Scanner;

public class WypiszNajwiekszaINajmniejsza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double number2 = scanner.nextDouble();
        System.out.println("Podaj trzecia liczbe: ");
        double number3 = scanner.nextDouble();

        // zapisywanie dwoch warunków zawsze z and (&&) albo or

        if (number1 > number2 && number1 > number3) {

            System.out.println("Najwieksza liczba: " + number1);


        } else if (number2 > number1 && number2 > number3) {


            System.out.println("Najwieksza liczba: " + number2);

        } else if (number3 > number1 && number3 > number2) {


            System.out.println("Najwieksza liczba: " + number3);
        }


    }
}



