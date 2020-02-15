package zajecia12stycznia;

public class FunkcjeIntro {


    static int fibonacci(int n) {
        int fib1 = 1;
        int fib2 = 1;
        int suma = 0;
        for (int i = 3; i <= n; i++) {
            suma = fib1 + fib2;
            fib1 = fib2;
            fib2 = suma;
        }
        return suma;

    }


    // prost funkcja pobierajaca 2 argumenty i zwracajaca ich sume
    // funkcje metody definiujemy w ciele KLASY, a wiec nie w mainie
    static int dodawanie(int a, int b) {
        return a + b;

    }

    //funkcja ktora nic nie zwraca ale wypisuje zawartosc tablicy

    static void printArray(String[] array) {
        System.out.print("[ ");
        for (String i : array) {
            System.out.print(i + ", ");

        }


        //kasujemy ostatni przecinek

        System.out.print('\b');
        System.out.print('\b');
        System.out.print(" ]");


    }


//Schemat dodawania funkcji TYP_ZWRACANY(STRING,INT,DOUBLE,INT[]....) THEN NAZWA FUNKCJI(dodaj,odpal0,zapisz)
    //THEN LISTA ARGUMENTOW (int,string...) {
    // cialo funckji

    //return
    // }

    public static void main(String[] args) {
        int pierwszaLiczba = 10;

        int drugaLiczba = 20;

        int wynik = dodawanie(pierwszaLiczba, drugaLiczba);
        System.out.println("Wynik dodawania to : " + wynik);


        String[] imiona = {"Jan", "Janusz", "Marian"};
        printArray(imiona);
    }
}
