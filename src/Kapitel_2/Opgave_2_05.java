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
        double subtotal = input.nextDouble();
        //Vi har vores første input, som er subtotal

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the gratuity rate: ");
        double gratuity = input1.nextDouble();
        //Vores anden input, som vi kalder gratuity i procent

        double gra = (subtotal / 100 * gratuity);
        // Vi beregner gratuity i dollars, som vi kalder gra
        double total = (gra + subtotal);
        //Ved hjælp af ovenstående beregning kan vi nu beregne total som er gratuity i dollars + subtotal

        System.out.println("The subtotal is: " + subtotal + "and the gratuity rate is: " + gratuity);
        System.out.println("The gratuity is: $" + gra + " and the total will now be: $" + total);

        // Vi får et output, som fortæller os vores input, og vores resultat fra vores beregninger

    }
}
