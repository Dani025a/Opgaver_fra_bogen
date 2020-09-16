package Kapitel_2;
   //2.3 (Convert meters into feet) Write a program that reads a number in meters,
   //converts it to feet, and displays the result. One meter is 3.2786 feet
import java.util.Scanner;

public class Opgave_2_03 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a value for meter: ");
      double meter = input.nextDouble();
      // Nu kan man tilføje et input og inputet kalder vi meter og det er en double


      double feet = (meter * 3.2786);
      // regnestykket for at konventere fra meter til feet

      System.out.println(meter + " meters is " + feet + " feet");
      //Vores output
   }

}
