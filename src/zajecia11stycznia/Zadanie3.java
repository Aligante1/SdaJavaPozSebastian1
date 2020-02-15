package zajecia11stycznia;


import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int liczba1 = czytnik.nextInt();
        System.out.println("Podaj druga liczne: ");
        int liczba2 = czytnik.nextInt();
        if (liczba2>liczba1) {
            int suma = 0;
            for (int i = liczba1; i <= liczba2; i++){
                suma += i;
            }
            System.out.println("Suma przedziału od a=4" + liczba1 + "do b=" + liczba2 +"wynosi: " + suma);
        suma = 0;
            int index = 0;
        while (index <= liczba2) {
            suma += index;
            index++;
        }
            System.out.println("Suma przedziału od a=4" + liczba1 + "do b=" + liczba2 +"wynosi: " + suma);

        } else {

            System.out.println("Liczba 1 musibyc mniejsza od liczba 2");
        }


    }




}
