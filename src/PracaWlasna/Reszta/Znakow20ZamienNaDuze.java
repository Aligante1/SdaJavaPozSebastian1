package PracaWlasna.Reszta;

import java.util.Scanner;

public class Znakow20ZamienNaDuze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write subtitle(max 20 words): ");
        String subtitle1 = scanner.nextLine();
        System.out.println(subtitle1.toUpperCase());
        System.out.println(subtitle1.toLowerCase());

        char table[] = subtitle1.toCharArray();

        StringBuilder name = new StringBuilder();

        for(int i = 0; i < table.length ; i++ ){
            if (table[i] >= (char) 65 && table[i] <= (char) 90) {
                table[i] = (char)(table[i] + 32);
                name.append(table[i]);
            }else if (table[i] >= (char) 97 && table[i] <= (char) 122){
                table[i] = (char)(table[i] - 32);
                name.append(table[i]);
            }
        }
        System.out.println(name.toString());

    }
}
