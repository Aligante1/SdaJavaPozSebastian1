package Zajecia15luty2020;

import java.util.Random;
import java.util.Scanner;

public class GraLotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        int table[] = new int[6];
        int table1[] = new int[6];
        int sum = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Type number " + (i+1) + ": ");
            table[i] = scanner.nextInt();
            table1[i] = generator.nextInt(48)+1;
            System.out.println("Generate number " + (i+1) + " equals:" + table1[i]);

            if (table[i] == table1[i]){
                sum ++;
                System.out.println("Correct your number equal generate number");
            }
            System.out.println("Numbers that your type does not equal generate number");

        }
        System.out.println("You hit " + sum + " from 6 generate numbers");
        for(int i = 0; i <= 5; i++){
            if (table[i] == table[i]+1){

            }

        }

    }

}

