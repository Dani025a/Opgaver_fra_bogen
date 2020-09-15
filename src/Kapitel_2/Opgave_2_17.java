package Kapitel_2;

import java.util.Scanner;

public class Opgave_2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
        double Temp = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the wind speed (>= 2) in miles per hour:");
        double WindSpeed = input1.nextDouble();

        double t = 35.74 + (0.6215 * Temp) - (35.75 * Math.pow(WindSpeed, 0.16)) + (0.4275 * Temp * Math.pow(WindSpeed, 0.16));
        System.out.println("The wind chill index is: " + t);
    }

}
