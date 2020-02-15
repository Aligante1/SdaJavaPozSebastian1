package zajecia11stycznia;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = sc.nextInt();

        //I rozwiazanie
        for (int i = 0; Math.pow(2, i) <= n; i++){
            System.out.println(Math.pow(2, i) + ", ");

        }
        //II rozwiazanie
        System.out.println("\n2rozwiazanie: ");
        for(int i =1; i <= n; i = i * 2){
            System.out.println(i + ", ");
        }
    }
}
