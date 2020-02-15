package zajecia14grudnia;

public class OperatoryPorownania {
    public static void main(String[] args) {
        int wiek = 18;

    // Wersja I
        boolean czyPelnoletni = wiek >= 18;
        System.out.println("czy wiek >= 18? " + czyPelnoletni);
        // wersja II
        System.out.println(wiek == 18);

        System.out.println("Czy wiek mniejszy rowny 18 ?" + (wiek <= 18));

        System.out.println("Czy wiek rozny od 20?" + (wiek != 20));


    }
}
