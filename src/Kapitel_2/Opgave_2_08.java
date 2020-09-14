package Kapitel_2;
   //*2.8 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
   //     the current time in GMT. Revise the program so it prompts the user to enter the
   //     time zone offset to GMT and displays the time in the specified time zone.


import java.util.Scanner;

public class Opgave_2_08 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Skriv den ønskede tids zone: ");

        long TidsZone = input.nextInt();
        long Millisek = System.currentTimeMillis();
        long Sek = Millisek / 1000;
        long SekNu = Sek % 60;
        long Min = Sek / 60;
        long MinNu = Min % 60;
        long Timer = Min / 60;
        long TimerNu = (Timer + TidsZone) % 24;

        System.out.println("Klokken er nu " + TimerNu + ":" + MinNu + ":" + SekNu + " I tidszonen: " + TidsZone);
    }
}
