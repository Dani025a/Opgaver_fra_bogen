package Kapitel_2;
//**2.6 (Multiply the digits in an integer) Write a program that reads an integer between
   //      0 and 1000 and multiplies all the digits in the integer. For example, if an integer
   //      is 932, the multiplication of all its digits is 54.
   //      Hint: Use the % operator to extract digits, and use the / operator to remove the
   //      extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.

import java.util.Scanner;

public class Opgave_2_06 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Skriv et nummer mellem 0 og 1000: ");
            int num = input.nextInt();

            int TreNum = num % 10;
            int restNum = num / 10;
            int tonum = restNum % 10;
            restNum /= 10;
            int EtNum = restNum % 10;

            int multi = TreNum * tonum * EtNum;
            System.out.println("Hvis nummeret er: " + num + " Så er multiplikations nummeret: " + multi);
        }
    }

