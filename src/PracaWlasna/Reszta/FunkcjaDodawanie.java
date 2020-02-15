package PracaWlasna.Reszta;

import java.util.Scanner;

public class FunkcjaDodawanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First natural number: ");
        int first = scanner.nextInt();
        System.out.println("Second natural number: ");
        int second = scanner.nextInt();

        System.out.println(Sum(first,second));

    }
    static int Sum (int first, int second){
        int sum1 = first + second;
        return sum1;
    }
}
