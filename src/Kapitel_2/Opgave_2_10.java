package Kapitel_2;
   //2.10 (Science: calculating energy) Write a program that calculates the energy needed
   //     to heat water from an initial temperature to a final temperature. Your program
   //     should prompt the user to enter the amount of water in kilograms and the initial
   //     and final temperatures of the water. The formula to compute the energy is
   //     Q = M * (finalTemperature – initialTemperature) * 4184
   //     where M is the weight of water in kilograms, initial and final temperatures are in
   //    degrees Celsius, and energy Q is measured in joules

import java.util.Scanner;

public class Opgave_2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv mængden af vand i kg: ");
        double m = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Skriv den initiale temperatur:  ");
        double inTemp = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Skriv den endelige temperatur:  ");
        double finTemp = input2.nextDouble();

        double Q = (m * (finTemp - inTemp) * 4184);

        System.out.println("Du skal bruge  " + Q + " energi");

    }
}
