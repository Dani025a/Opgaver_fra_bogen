package Kapitel_4;

import java.awt.geom.Area;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Opgave_4_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        beregning(r);

    }
    public static void beregning(double r){

        double s = 2 * r * Math.sin(Math.PI / 5);

        double Area = (5 * Math.pow(s,2) / (4 * Math.tan (Math.PI / 5)));

        double rounded1 = Math.round(Area * 100) / 100.00;
        System.out.println(rounded1);


    }
}
