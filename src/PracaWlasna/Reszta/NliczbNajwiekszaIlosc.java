package PracaWlasna.Reszta;

import java.util.Scanner;

public class NliczbNajwiekszaIlosc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write n: ");
        int n = scanner.nextInt();
        int table[] = new int [n];
        int max = 0;
        for (int i = 0 ; i < n ;i++){
            table [i] = scanner.nextInt();
            if (table[i] > max){
                max = table[i];
            }

        }
        int maxScore = 0;
        for (int i = 0 ; i <n ;i++){
            if(table[i] == max){
                maxScore++;
            }

        }
        System.out.println("Max number is: " + max + " and her score is: " + maxScore);
    }
}
