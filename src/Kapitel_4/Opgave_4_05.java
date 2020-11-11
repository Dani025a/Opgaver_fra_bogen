package Kapitel_4;

import java.awt.geom.Area;
import java.util.Scanner;

public class Opgave_4_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides:");
        double n = input.nextDouble();

        System.out.println("Enter the side: ");
        double s = input.nextDouble();
        beregninger(s, n);
    }
    public static void beregninger(double s, double n){
        double Area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/n));
        System.out.println(Area);

    }
}
