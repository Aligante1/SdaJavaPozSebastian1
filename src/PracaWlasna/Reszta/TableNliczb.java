package PracaWlasna.Reszta;

import java.util.Scanner;

public class TableNliczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number n: ");
        int n = scanner.nextInt();
        if (n >= 1 && n <= 30) {
            System.out.println("Number is corret!");
        } else {
            System.out.println("Number is wrong!");
            return;
        }
        int [] table = new int[n];
        for (int i = 0; i < n; i++){
            table [i] = scanner.nextInt();
            System.out.println(Math.pow(table[i],2));
        }

    }
}
