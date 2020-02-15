package PracaWlasna.Reszta;

public class Przez7od1do500 {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 500 ; i++ ) {
            int y = 0 ;
            // modulo % sprawdza czy dana liczba jest podzielna przez druga bez reszty
            y = i % 7;
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
