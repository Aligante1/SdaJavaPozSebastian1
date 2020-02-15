package zajecia11stycznia;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miejsce: ");
        int n = scanner.nextInt();
        int suma = 0;
        int fib1 = 1;
        int fib2 = 1;
        System.out.println("fib( 1) = "+ fib1);
        System.out.println("fib( 2) = "+ fib2);

        for (int i = 3; i <= n; i++){
            suma = fib1 + fib2;//obliczanie kolejnego wyrazu
            fib1 = fib2;
            fib2 = suma;
            System.out.println("fib( " + i + ") = " +suma);
        }

    }
}
