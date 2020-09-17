package Kapitel_2;
   //2.12 (Physics: finding runway length) Given an airplane’s acceleration a and take-off
   //     speed v, you can compute the minimum runway length needed for an airplane to
   //     take off using the following formula:
   //     length = (v^2)/(2a)
   //
   //     Write a program that prompts the user to enter v in meters/second (m/s) and the
   //     acceleration a in meters/second squared (m/s2),
   //     then, displays the minimum runway length

import java.util.Scanner;

public class Opgave_2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed: ");
        double speed = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the speed: ");
        double accel = input1.nextDouble();

        double length = (speed * speed) / (2 * accel);

        System.out.println("The minimum runway length for this airplane is: " + length);
    }
}
