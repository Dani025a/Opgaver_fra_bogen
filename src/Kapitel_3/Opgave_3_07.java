package Kapitel_3;

import java.util.Scanner;

public class Opgave_3_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv det ønskede beløb i dollars, f.eks.  11.56: ");
        double beløb = input.nextDouble();

        Beregninger(beløb);

    }

    public static void Beregninger(double beløb) {

        int resterendeBeløb = (int) (beløb * 100);
        int nummerAfEnDollar = resterendeBeløb / 100;
        resterendeBeløb = resterendeBeløb % 100;
        int nummerAfQuarters = resterendeBeløb / 25;
        resterendeBeløb = resterendeBeløb % 25;
        int nummerAfDimes = resterendeBeløb / 10;
        resterendeBeløb = resterendeBeløb % 10;
        int nummerAfNickels = resterendeBeløb / 5;
        resterendeBeløb = resterendeBeløb % 5;
        int nummerAfPennies = resterendeBeløb;
        VoresOutput(beløb, nummerAfEnDollar, nummerAfDimes, nummerAfNickels, nummerAfPennies, nummerAfQuarters);
    }

    public static void VoresOutput(double beløb, int nummerAfEnDollar, int nummerAfQuarters, int nummerAfDimes, int nummerAfNickels, int nummerAfPennies) {

        System.out.println("Dit beløb er: " + beløb + " og består af");

        if (nummerAfEnDollar == 1)
            System.out.println("    " + nummerAfEnDollar + " dollar");
        else
            System.out.println("    " + nummerAfEnDollar + " dollars");
        if (nummerAfQuarters == 1)
            System.out.println("    " + nummerAfQuarters + " quarter ");
        else
            System.out.println("    " + nummerAfQuarters + " quarters ");

        if (nummerAfDimes == 1)
            System.out.println("    " + nummerAfDimes + " dime");
        else
            System.out.println("    " + nummerAfDimes + " dimes");

        if (nummerAfNickels == 1)
            System.out.println("    " + nummerAfNickels + " nickel");
        else
            System.out.println("    " + nummerAfNickels + " nickels");

        if (nummerAfPennies == 1)
            System.out.println("    " + nummerAfPennies + " penny");
        else
            System.out.println("    " + nummerAfPennies + " pennies");
    }

}

