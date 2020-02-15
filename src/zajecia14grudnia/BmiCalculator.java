package zajecia14grudnia;

import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        // ctrl+alt+l sformatowanie kodu

        System.out.println("Podaj swoja wage: ");
        double waga = czytnik.nextDouble();
        System.out.println("Podaj swoj wzrost (w metrach): ");
        double wzrost = czytnik.nextDouble();
        double bmi = waga / Math.pow(wzrost, 2);
        // bez Math.pow()
        // double bmi2 = waga/ (wzrost * wzrost);


        System.out.println("Twoje BMI wynosi: " + bmi);

        if (bmi < 18.5){
            System.out.println("Waga zbyt niska");
        } else if (bmi < 25) {
            System.out.println("Waga ok");
        } else if (bmi < 30) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Otylosc");
        }

        System.out.println("Koniec programu....");
    }
}
