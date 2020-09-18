package Kapitel_3;

import java.util.Scanner;

public class Opgave_3_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("skriv 3 forskellige integers: ");
        int nummerEt = input.nextInt();
        int nummerTo = input.nextInt();
        int nummerTre = input.nextInt();
        int tal;

        if (nummerEt > nummerTo ){
            tal = nummerEt;
            nummerEt = nummerTo;
            nummerTo = tal;
        }
        if (nummerTo > nummerTre){
            tal = nummerTo;
            nummerTo = nummerTre;
            nummerTre = tal;
        }
        if (nummerEt > nummerTre){
            tal = nummerTre;
            nummerEt = nummerTre;
            nummerTre = tal;
        }
        if (nummerEt > nummerTo ){
            tal = nummerEt;
            nummerEt = nummerTo;
            nummerTo = tal;
        }

        System.out.println("Smallest to biggest number " + nummerEt + " " + nummerTo + " " + nummerTre);

    }

}
