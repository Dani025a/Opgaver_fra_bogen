package Kapitel_2;
   //2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
   //     to enter the number of years and display the population after the number of years.
   //     Use the hint in Programming Exercise 1.11 for this program.

import java.util.Scanner;

public class Opgave_2_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Skriv antal år: ");
        long Years = input.nextLong();

        long Birth = (365 * 24 * 60 * 60) / 7;
        long Immi = (365 * 24 * 60 * 60) / 45;
        long Death = (365 * 24 * 60 * 60) / 13;

        long CurrentPop = 312032486;

        long Pop = (Birth + Immi) * Years -  (Death * Years) + CurrentPop;

        System.out.println("There will be: " + (Birth * Years) + " Born" + "\n" + "There will be: " + (Death * Years) + " Death" + "\n" +  "There will be: " + (Immi * Years) + " Immigrants" + "\n" + "\n" + "The population will be at: " + Pop );

    }
}
