package Kapitel_06;

import java.util.Scanner;

public class Opgave_6_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        StringBuilder result = new StringBuilder(integer + " is ");

        result.append(isPalindrome(integer) ? "a palindrome" : "not a palindrome");

        System.out.println(result);
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        StringBuilder reverseNumber = new StringBuilder(number + "");
        reverseNumber = reverseNumber.reverse();
        return Integer.parseInt(reverseNumber.toString());
    }
}
