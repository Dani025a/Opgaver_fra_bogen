package Kapitel_2;
   //2.13 (Financial application: compound value) Suppose you save $100 each month in a
   //     savings account with annual interest rate 3.75%. Thus, the monthly interest rate is
   //     0.0375/12 = 0.003125. After the first month, the value in the account becomes
   //     100 * (1 + 0.003125) = 100.3125
   //     After the second month, the value in the account becomes
   //     (100 + 100.3125) * (1 + 0.003125) = 200.938
   //     After the third month, the value in the account becomes
   //     (100 + 200.938) * (1 + 0.003125) = 301.878
   //     and so on.
   //     Write a program that prompts the user to enter a monthly saving amount and
   //     displays the account value after the sixth month. (In Exercise 5.30, you will use
   //     a loop to simplify the code and display the account value for any month.)

import java.util.Scanner;

public class Opgave_2_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        double Amount = input.nextDouble();

        double FMonth = Amount * (1 + 0.003125);
        double SMonth = (Amount + FMonth) * (1 + 0.003125);
        double TMonth = (Amount + SMonth) * (1 + 0.003125);
        double FoMonth = (Amount + TMonth) * (1 + 0.003125);
        double FiMonth = (Amount + FoMonth) * (1 + 0.003125);
        double SiMonth = (Amount + FiMonth) * (1 + 0.003125);

        System.out.println("First month Balance: " + FMonth);
        System.out.println("Second month Balance: " + SMonth);
        System.out.println("Third month Balance: " + TMonth);
        System.out.println("Sixth month Balance: " + SiMonth);
    }
}
