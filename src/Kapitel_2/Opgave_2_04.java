package Kapitel_2;
   //2.04 (Convert square meter into ping) Write a program that converts square meter into ping.
   //     The program prompts the user to enter a number in square meter, converts it to ping,
   //     and displays the result. One square meter is 0.3025 ping

import java.util.Scanner;

public class Opgave_2_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in square meters: ");
        double sqrmeter = input.nextDouble();

        double ping = (sqrmeter * 0.3025);

        System.out.println(sqrmeter + " square meters is " + ping + " pings");
    }

}
