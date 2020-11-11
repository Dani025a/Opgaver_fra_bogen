package Kapitel_06;

import java.util.Scanner;

public class Opgave_6_02 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Skriv et nummer: ");
        long number = input.nextLong();

        System.out.println("Summen af " + number +
                " er " + sumDigits(number));
    }

    public static int sumDigits(long n) {
        long numberCalculator = Math.abs(n);
        int sum = 0;

        while (numberCalculator != 0) {
            int numbersBack = (int)(numberCalculator % 10);
            sum += numbersBack;
            numberCalculator = numberCalculator / 10;
        }

        return sum;
    }
}
