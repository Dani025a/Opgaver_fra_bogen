package Kapitel_2;

   //2.01 (Convert mile to kilometer) Write a program that reads a mile in a double value
   //     from the console, converts it to kilometers, and displays the result. The formula
   //     for the conversion is as follows:
   //     1 mile = 1.6 kilometers

import java.util.Scanner;

public class Opgave_2_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("indsæt antal miles du ønsker at konventere: ");

        double miles = input.nextDouble();
        double kilometer = miles * 1.6;
        System.out.println(miles + " miles * 1.6 kilometer = " + kilometer);





    }
}
