package PracaWlasna.Reszta;

import java.util.Scanner;

public class RownanieKwadratowe2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość a: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj wartość b: ");
        double b = scanner.nextDouble();
        System.out.println("Podaj wartość c: ");
        double c = scanner.nextDouble();
        double delta = ((b * b) - (4 * a * c));
    }
}
//
  //*switch (delta) {
           // case delta > 0 :
                //System.out.println("Pierwszy pierwiastek:" + (-b - Math.sqrt(delta)) / (2 * a) + " Drugi pierwiastek:" + (-b + Math.sqrt(delta)) / (2 * a));
               // break;
            //case delta == 0 :
               // System.out.println("Pierwiastek wynosi: " + (-b / 2));
                //break;
            //case delta > 0 :
                //System.out.println(" Brak pierwiastków ");
                //break;

       // }

    //}
//}
