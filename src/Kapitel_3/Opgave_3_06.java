package Kapitel_3;

import java.util.Scanner;

public class Opgave_3_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();

        System.out.println("Enter feet: ");
        double feet = input.nextDouble();

        System.out.println("Enter inches: ");
        double inches = input.nextDouble();

        double inchesIAlt = feet * 12 + inches;

        double bmi = pounds / inchesIAlt / inchesIAlt * 703;

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
