package PracaWlasna.Reszta;

import java.util.Random;

public class Zbior0do99 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] table = new int[5];
        int max = 0;
        int min = 0;
        for (int i = 0; i < 5 ; i++){
            table[i] =  random.nextInt(99);
            if( table[i] >= max){
                max = table[i];
            }else{
                min = table[i];
            }

        } int suma = 0;
        for (int i = 0 ; i < 5 ; i++){
            //petla przechodzi 5 razy za kazdym razem dodaje table[i] na poczatku pozycje 0 pozniej 1 itd.
            suma += table[i];
        }
        System.out.println("Srednia" + suma/5);
        System.out.println("Najwieksze: " + max + "Najmniejsza: " + min);
    }

}
