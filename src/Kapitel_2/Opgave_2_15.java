package Kapitel_2;

import java.util.Scanner;

public class Opgave_2_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x2 = input1.nextDouble();
        double y2 = input1.nextDouble();

        double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("The distance between the two points is: " + a);
    }
}
