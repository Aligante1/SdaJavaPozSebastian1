package PracaWlasna.Reszta;

import java.util.Scanner;

public class od1do500przez5 {
    static void WriteNumbersDividingBy5 (){
        for (int i = 1; i <= 500; i++){
            if(i % 5 == 0){
                System.out.println("Liczby podzielne przez 5: ");

                System.out.println(i);
            }

        }

    }
    static void WriteNumbersDividingBy5WithScanner (int n,int m){
        for (int i = m; i <= n; i++){
            if(i % 5 == 0){
                System.out.println("Liczby podzielne przez 5: ");

                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number m: ");
        int m = scanner.nextInt();
        System.out.println("Give number n: ");
        int n = scanner.nextInt();
       // WriteNumbersDividingBy5();
        WriteNumbersDividingBy5WithScanner(n,m);
    }
}
