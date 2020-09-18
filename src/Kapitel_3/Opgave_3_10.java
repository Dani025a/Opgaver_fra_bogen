package Kapitel_3;

import java.util.Scanner;

public class Opgave_3_10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {


            int nummerEt = (int) (Math.random() * 1000);
            int nummerTo = (int) (Math.random() * 1000);

            int a = nummerEt * nummerTo;

            Scanner input = new Scanner(System.in);
            System.out.println("Hvad er " + nummerEt + " * " + nummerTo);
            int svar = input.nextInt();

            if (svar == a)
                System.out.println("Det er korrekt!");
            else
                System.out.println("Det er forkert :(");
        }

    }
}
