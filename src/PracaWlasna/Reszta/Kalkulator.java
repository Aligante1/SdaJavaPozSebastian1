package PracaWlasna.Reszta;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Witam w kalkulatorze Sebka");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj jakie działanie chcesz wykonać(znak1): ");

        //Zczytuje calego stringa ale biore tylko pierwsza pozycje(czyli w jezyku programowania 0)
        char mark = scanner.next().charAt(0);
        System.out.println("Podaj druga liczbe: ");


        double number2 = scanner.nextDouble();
        switch (mark) {
            case '+' :
                System.out.println("Dodawanie wynik: " + (number1+number2));
                break;
            case '-' :
                System.out.println("Odejmowanie wynik: " + (number1-number2));
                break;
            case '*':
                System.out.println("Mnożenie wynik: " + (number1*number2));
                break;
            case '/':
                if ( number2 < 0 && number1 < 0 ) {
                    System.out.println("Nie mozna dzelic przez zero");
                    break;
                } else if (number2 > 0 && number1 > 0) {
                System.out.println("Dzielenie wynik: " + (number1 / number2));
                break;
            }
            default: {
                System.out.println("zły znak");
            }




        }


    }
}
