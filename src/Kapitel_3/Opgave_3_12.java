package Kapitel_3;

import java.util.Scanner;

public class Opgave_3_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int nummer = input.nextInt();

        if (nummer % 10 == nummer / 100) {
            System.out.println(nummer + " is a palindrome");
        } else {
            System.out.println(nummer + " is not a palindrome");
        }

    }
}
