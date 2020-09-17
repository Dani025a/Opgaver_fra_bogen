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

            int treNum = num % 10;
            int restNum = num / 10;
            int tonum = restNum % 10;
            restNum /= 10;
            int etNum = restNum % 10;

            if(num == 1000)
                System.out.println("Hvis nummeret er " + num + " Så er multiplikations nummeret: 0");

            else if((num >= 100) && (num <= 999))   {
                int multi = treNum * tonum * etNum;
                System.out.println("Hvis nummeret er " + num + " Så er multiplikations nummeret: " + multi);
            }
            else if((num >= 10) && (num <= 99))   {
                int multi1 = treNum * tonum;
                System.out.println("Hvis nummeret er " + num + " Så er multiplikations nummeret: " + multi1);
            }
            else if((num >= 0) && (num <= 9))   {
                System.out.println("Hvis nummeret er " + num + " Så er multiplikations nummeret: " + num);
            }
            else
                System.out.println("Fejl du skulle skrive et tal mellem 0 og 1000");

        }
    }

