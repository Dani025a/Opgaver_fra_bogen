package Kapitel_3;

import java.util.Scanner;

public class Opgave_3_02 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis()/ 100 % 10);

        Scanner input = new Scanner(System.in);
        System.out.print("Hvad er " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " Svaret er: " + (number1 + number2 + number3 == answer));

    }
}
