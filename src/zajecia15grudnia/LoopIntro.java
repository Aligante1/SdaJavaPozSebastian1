package zajecia15grudnia;

public class LoopIntro {
    public static void main(String[] args) {
        //prosta petla wile wypisujaca wartosci od 0-9

        int wiek = 20;
        wiek = 25;
        System.out.println(wiek);

        wiek = wiek + 5;

        System.out.println(wiek);
        //skrocone zwiekszene wartosci
        wiek += 7;


        // post- vs pre- inkrementacja
        //postinkrementacja  -++
        int liczba = 0;
        System.out.println(liczba++);// 0
        System.out.println(liczba); // 1
        //preinkrementacja ++-
        int number = 0;
        System.out.println(++number); // 1
        System.out.println(number); // 1
        //zwiekszanie wartosci o jeden
        wiek++;

        System.out.println(wiek);

        // petla wypisujaca liczby od 0-9
        //petla while moze wykonac sie 0 razy,poniewaz warunek nastepuje przed wejsciem do petli
        System.out.println("Petla while....");
        int licznik = 0;
        while (licznik < 10) {
            System.out.println(licznik);
            licznik++;
            // i++j postinkrementacja ++ij preinkrementacja
        }


        System.out.println("Petla do while");
        int x = 20;
        do{
            System.out.print(x++);
            System.out.print(", ");
        }while (x < 10);
    }
}
