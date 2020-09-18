package Kapitel_3;

import java.util.Scanner;

public class Opgave_3_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double x = Math.pow(b,2) - 4 * a * c;

        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2 * a;
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ 2 * a;

        if (x > 0){
            System.out.println (r1 + " and " + r2);
        }
        if (x == 0){
            System.out.println (r1);
        }
        else
            System.out.println("The equation has no real roots");

    }
}
