package zajecia11stycznia;

import java.util.Scanner;

public class Arrays1zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        //tworzymy nowa tablice
        int[] array = new int[size];

        //wypelnij w petli for tablice
        //np.
        // Podaj 1 element tablicy
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + i + " element tablicy: ");
            int liczba = scanner.nextInt();
            array[i] = liczba;
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
            if (min > array[i]) {
                min = array[i];
            }
            System.out.println("Minimalna wartosc:" + min);
        }

        // max
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[1] < max) {
                //akrualny max wiekszy od i-tego elementu wiec nic nie robimy
                //kontynujemy petle i zaczynamy nowy obieg petli
                continue;
            }
            //pozostale przypadki
            max = array[i];


        }
        System.out.println("Najwieksza wartosc to:" + max);

        float avg = 0;
        float suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            System.out.println("Srednia to: " + avg);
        }

        avg = suma / array.length;
    }
}


