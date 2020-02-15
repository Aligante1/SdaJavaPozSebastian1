package PracaWlasna.Reszta;

import java.util.Scanner;

public class TrzyOdcinki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First segment: ");
        double first = scanner.nextDouble();
        System.out.println("Second segment: ");
        double second = scanner.nextDouble();
        System.out.println("Third segment: ");
        double third = scanner.nextDouble();
        CheckTriangle(first,second,third);

    }

    static void CheckTriangle(double first, double second, double third) {
        if (first > second && first > third) {
            if (first < second + third) {
                double littlep = (first + second + third) / 2;
                double area = Math.sqrt(littlep * (littlep - first) * (littlep - second) * (littlep - third));
                System.out.println("Area: " + area);
            } else {
                System.out.println("Cannot build triangle");
            }


        } else if (second > first && second > third) {
            if (second < first + third) {
                double littlep = (first + second + third) / 2;
                double area = Math.sqrt(littlep * (littlep - first) * (littlep - second) * (littlep - third));
                System.out.println("Area: " + area);
            } else {
                System.out.println("Cannot build triangle");
            }
        } else {
            if (third < second + first) {
                double littlep = (first + second + third) / 2;
                double area = Math.sqrt(littlep * (littlep - first) * (littlep - second) * (littlep - third));
                System.out.println("Area: " + area);
            } else {
                System.out.println("Cannot build triangle");
            }
        }


    }
}
