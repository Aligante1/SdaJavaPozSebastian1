package PracaWlasna.Reszta;

public class Trojargumentowy {
    public static void main(String[] args) {
     for (int i = 100; i <= 300; i++){
         // wersja pierwsza gdzie parzysta robimy z modulo
         System.out.println(i);
         if (i % 2 == 0){
             System.out.println("Liczba parzysta: ");
         }else {
             System.out.println("Liczba nieparzysta: ");
         }
        /* Sytuacja gdzie nieparzysta idzie na pierwszy front
        System.out.println(i);
         if (i % 2 != 0){
             System.out.println("Liczba nieparzysta: ");
         }else {
             System.out.println("Liczba parzysta: ");

         }

         Trzeci sposób
         for (int i = 100; i <= 300; i++){
         Boolean isEven = true;
         isEven - i % 2 == 0 ? true :false;

         if (IsEven) {
         sout("Liczba jest parzysta jest parzysta: ");
         } else {
         sout("Liczba jest nieparzysta: ");
         }
         sout(i)
         */



     }
    }
}
