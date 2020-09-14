package Kapitel_2;

import java.util.Scanner;

public class Opgave_2_09 {
    public static void main(String[] args) {

        System.out.println("beregn den gennemsnitlige acceleration ved brug af formulaen     v^1 - v^2");
        System.out.println("                                                             a = -----------");
        System.out.println("                                                                      t");

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv v^0: ");
        double v0 = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Skriv v^1: ");
        double v1 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Skriv t: ");
        double t = input2.nextDouble();
        double a = ((v1 - v0) / t);

        System.out.println("Resultatet er: " + a);

    }
}
