package zajecia15grudnia;

public class ZadanieLoop3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0) {
                System.out.println(i + ", ");
            }
        }
        //wersja 2
        for (int i = 2; i <=100; i +=2){
            System.out.println(i + ", ");
        }

        for (int i = 99; i > 0;  i -=2){
            System.out.println(i);
        }
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
            System.out.println(suma);

        }




    }
}
