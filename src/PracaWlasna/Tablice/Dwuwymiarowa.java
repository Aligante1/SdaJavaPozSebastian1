package PracaWlasna.Tablice;


public class Dwuwymiarowa {
    public static void main(String[] args) {
        int table [][] = new int[10][10];
        int sum = 0;
        for (int j = 0; j < 10; j++){
            for (int i = 0; i < 10; i++){
                table[j][i] = 0;
                if(i == j){
                    table[j][i] = j;
                    sum += j;
                }

            }

        }

        System.out.println(sum);
    }
}
