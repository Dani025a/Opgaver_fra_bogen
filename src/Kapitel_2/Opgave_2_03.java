package Kapitel_2;
   //2.3 (Convert meters into feet) Write a program that reads a number in meters,
   //converts it to feet, and displays the result. One meter is 3.2786 feet
import java.util.Scanner;

public class Opgave_2_03 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a value for meter: ");
      double meter = input.nextDouble();

      double feet = (meter * 3.2786);

      System.out.println(meter + " meters is " + feet + " feet");


   }

}
