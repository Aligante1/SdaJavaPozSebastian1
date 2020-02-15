package zajecia14grudnia;

import java.util.Scanner;

public class IfElseIntro {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        // ctrl+alt+l sformatowanie kodu
        int wiek = czytnik.nextInt();

        if (wiek >= 18) {
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("Nie jestes pelnoletni");
        }

    }
}
