package zajecia12stycznia;

import java.util.Random;

public class Arrays2Dintro {
    public static void main(String[] args) {

        int[][] macierz = new int[5][5];
        System.out.println(macierz.length);//zwraca liczbe wierszy
        System.out.println(macierz[0].length);//zwraca liczbe kolumn
        Random random = new Random();
        //wypelnianie macierzy wartosciami losowymi
        //shift+f6 zmiana nazwy zmiennej w calym pliku

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                macierz[i][j] = random.nextInt(10) - 5;
            }
        }

        //wyswietlanie macierzy

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.print(macierz[i][j] + ", ");


            }
            //po wypisaniu calego wiersza przejdz do nowej linii
            System.out.println();
        }


        int[] maxWwierszach = new int[macierz.length];
        for (int i = 0; i < macierz.length; i++) {
            int max = macierz[i][0];
            for (int j = 0; j < macierz[0].length; j++) {

                //w petli wewnetrznej przechodzimy caly wiersz, tutaj szukamy max
                if (max < macierz[i][j]) {
                    max = macierz[i][j];
                }
            }
            maxWwierszach[i] = max;
        }
        System.out.println("Maksymalne wartości w wierszach: ");
        for (int wWierszach : maxWwierszach){
            System.out.println(wWierszach + ", ");
        }

    }

// ctrl + alt +l porzadkowanie kodu
}

