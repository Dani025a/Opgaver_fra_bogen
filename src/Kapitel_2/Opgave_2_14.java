package Kapitel_2;
//*2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of
//health on weight. It can be calculated by taking your weight in kilograms and
//dividing, by the square of your height in meters. Write a program that prompts the
//user to enter a weight in pounds and height in inches and displays the BMI. Note
//one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a
//sample run:


import java.util.Scanner;

public class Opgave_2_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 or 2\n" + "1. is in Kilograms and Meters\n" + "2 is in pounds and inches");
        double Tal = input.nextDouble();

        if (Tal == 1) {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter weight in Kilograms");
            double Kilogram = input1.nextDouble();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter height in meters");
            double Meter = input2.nextDouble();

            double BMI = Kilogram / (Meter * Meter);
            System.out.println("BMI is: " + BMI);

        }
        if (Tal == 2) {
            Scanner input3 = new Scanner(System.in);
            System.out.println("Enter weight in Pounds: ");
            double Pounds = input3.nextDouble();

            Scanner input4 = new Scanner(System.in);
            System.out.println("Enter height in Inches: ");
            double Inches = input4.nextDouble();

            double BMI1 = (703 * Pounds) / (Inches * Inches);
            System.out.println("BMI is: " + BMI1);
        }

        else
            System.out.println("Fejl du skal skrive 1 eller 2");
    }
}
