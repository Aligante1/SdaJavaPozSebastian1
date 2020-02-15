package zajecia12stycznia;

public class Funkcje3zadanie {

    static boolean isPalindrome(String text) {
        // kajak -> dlugosc wynosi 5; 5/2 = 2

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {

                //porownujemy odpowiadajace sobie litery
                //pierwsza litere usimy porownac z ostatnia
                //driga litere z przed ostatnia
                //od uzyskania informacji ktora litere od konca muismy porownac
                //obliczamy: text.length() - 1 -> ostatnia litera
                // od (text.length() -1 ) odemujemy jeszcze i
                //zeby uzyskac przesuniecie czyli odpowiadajaca litere od tylu
                continue;
            } else {
                return false;
            }
        }
        return true;
    }


        public static void main (String[]args){

            System.out.println(isPalindrome( "anna"));
}
    }
