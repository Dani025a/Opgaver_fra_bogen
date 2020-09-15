package Kapitel_2;

import java.util.Scanner;

public class Opgave_2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght of the side: ");
        double length = input.nextDouble();

        double Area = ((3 * Math.sqrt(3)) / 2) * (length * length);

        System.out.println("The area of the hexagon is: " + Area);
    }
}
