package Zajecia15luty2020;

import java.util.Scanner;

public class MetodaSplit {
    public static void main(String[] args) {
      String myNumber = "5555";
      int sum = 0;
      for (int i = 0; i <myNumber.length(); i++){
          char c = myNumber.charAt(i);
          String value = String.valueOf(c);
          sum = sum + Integer.valueOf(value);

      }
        System.out.println(sum);
    }
}
