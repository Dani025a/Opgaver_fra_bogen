package Kapitel_2;
   //*2.8 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
   //     the current time in GMT. Revise the program so it prompts the user to enter the
   //     time zone offset to GMT and displays the time in the specified time zone.


import java.util.Scanner;

public class Opgave_2_08 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Skriv den ønskede tids zone: ");
        long tidsZone = input.nextInt();

        long millisek = System.currentTimeMillis();
        long sek = millisek / 1000;
        long sekNu = sek % 60;
        long min = sek / 60;
        long minNu = min % 60;
        long timer = min / 60;
        long timerNu = (timer + tidsZone) % 24;

        System.out.println("Klokken er nu " + timerNu + ":" + minNu + ":" + sekNu + " I tidszonen: " + tidsZone);
    }
}
