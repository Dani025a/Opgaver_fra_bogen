package Kapitel_2;
   //2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
   //     to enter the number of years and display the population after the number of years.
   //     Use the hint in Programming Exercise 1.11 for this program.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Opgave_2_11 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###,###,###,###,###,###,###,5" +
                "###");

        Scanner input = new Scanner(System.in);
        System.out.println("Skriv antal år: ");
        long years = input.nextLong();

        long birth = (365 * 24 * 60 * 60) / 7;
        long immi = (365 * 24 * 60 * 60) / 45;
        long death = (365 * 24 * 60 * 60) / 13;

        long currentPop = 312032486;

        long pop = (birth + immi) * years -  (death * years) + currentPop;


        System.out.println("There will be: " + df.format(birth * years) + " Born" + "\n" + "There will be: " + df.format(death * years) + " Death" + "\n" +  "There will be: " + df.format(immi * years) + " Immigrants" + "\n" + "\n" + "The population will be at: " + df.format(pop));

    }
}
