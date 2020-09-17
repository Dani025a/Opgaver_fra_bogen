package Kapitel_2;
   //*2.07 (Find the number of years) Write a program that prompts the user to enter the
   //      minutes (e.g., 1 billion), and displays the number of years and remaining days for
   //      the minutes. For simplicity, assume that a year has 365 days.

import java.util.Scanner;

public class Opgave_2_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Skriv antal minuter: ");
        long minuter = input.nextLong();

        long years = (minuter / (60 * 24 * 365));
        long dage = (minuter / 60 / 24 % 365);

        System.out.println(minuter + " minuter er omkring: " + years + " År og " + dage + " Dage.");
    }
}
