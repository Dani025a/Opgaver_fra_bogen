package Kapitel_2;
   //*2.05 (Financial application: calculate tips) Write a program that reads the subtotal
   //      and the gratuity rate and then computes the gratuity and total. For example, if the
   //      user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
   //      as gratuity and $11.2 as total. Here is a sample run:

import java.util.Scanner;

public class Opgave_2_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal: ");
        double subTotal = input.nextDouble();
        //Vi har vores første input, som er subtotal

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the gratuity rate: ");
        double gratuityProcent = input1.nextDouble();
        //Vores anden input, som vi kalder gratuity i procent

        double gratuity = (subTotal / 100 * gratuityProcent);
        // Vi beregner gratuity i dollars, som vi kalder gra
        double total = (gratuity + subTotal);
        //Ved hjælp af ovenstående beregning kan vi nu beregne total som er gratuity i dollars + subtotal

        System.out.println("The subtotal is: " + subTotal + "and the gratuity rate is: " + gratuityProcent);
        System.out.println("The gratuity is: $" + gratuity + " and the total will now be: $" + total);

        // Vi får et output, som fortæller os vores input, og vores resultat fra vores beregninger

    }
}
