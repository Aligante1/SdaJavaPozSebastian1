package PracaWlasna.Reszta;

import java.util.Random;
import java.util.Scanner;

public class SprawdzanieMnozenia {
    public static void main(String[] args) {
        Random generator = new Random();
        int number1 = generator.nextInt(3);
        int number2 = generator.nextInt(3);
        System.out.println("Number one: " + number1 + "Number two: "+ number2);
        System.out.println("What is the multiplie of this numbers? ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        while (Multiplie(number1,number2) != answer){
            System.out.println("Wynik zły");
             answer = scanner.nextInt();
        }
    }
    static int Multiplie(int number1,int number2){
       return number1 * number2;

    }


}
