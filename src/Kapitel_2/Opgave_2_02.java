package Kapitel_2;
   //2.02 (Compute the volume of a triangle) Write a program that reads in the length of
   //     sides of an equilateral triangle and computes the area and volume using the following formulas:
   //     area = (√3)/4 * (length of sides)^2
   //     volume = area * length
import java.util.Scanner;

public class Opgave_2_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the Equilateral:");
        double length = input.nextDouble();
        // Nu kan man tilføje et input og inputet kalder vi length og det er en double

        double areal = (Math.sqrt(3) / 4 * length * length);
        // Beregningen for arealet
        double volume = (areal * length);
        //beregninggen for volumen

        System.out.println("Arealet er: " + areal + " og volumen er: " + volume);
        //Vi printer et output, som er arealet og volumen

    }
}
