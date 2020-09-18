package Kapitel_3;

import java.util.Scanner;

public class Opgave_3_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter today’s day from (Sunday is 0, Monday is 1, . . . , and Saturday is 6):");
        int days = input.nextInt();

        System.out.println("Enter the number of days elapsed since today:");
        int daysElapsed = input.nextInt();

        if (days == 0) {
            System.out.println("Today is Sunday");
            switch (daysElapsed){
                case 1:System.out.println("And the future day is monday "); break;
                case 2:System.out.println("And the future day is Tuesday"); break;
                case 3:System.out.println("And the future day is Wednesday"); break;
                case 4:System.out.println("And the future day is Thursday"); break;
                case 5:System.out.println("And the future day is Friday"); break;
                case 6:System.out.println("And the future day is Saturday"); break;
            }
        }
        else if (days == 1) {
            System.out.println("Today is Monday");
            switch (daysElapsed){

                case 1:System.out.println("And the future day is Tuesday"); break;
                case 2:System.out.println("And the future day is Wednesday");break;
                case 3:System.out.println("And the future day is Thursday"); break;
                case 4:System.out.println("And the future day is Friday"); break;
                case 5:System.out.println("And the future day is Saturday"); break;
                case 6:System.out.println("And the future day is Sunday"); break;
            }

        }
        else if (days == 2) {
            System.out.println("Today is Tuesday");
            switch (daysElapsed){
                case 1:System.out.println("And the future day is Wednesday"); break;
                case 2:System.out.println("And the future day is Thursday");break;
                case 3:System.out.println("And the future day is Friday"); break;
                case 4:System.out.println("And the future day is Saturday"); break;
                case 5:System.out.println("And the future day is Sunday"); break;
                case 6:System.out.println("And the future day is monday"); break;
            }
        }
        else if (days == 3) {
            System.out.println("Today is Wednesday");
            switch (daysElapsed) {
                case 1:System.out.println("And the future day is Thursday"); break;
                case 2:System.out.println("And the future day is Friday");break;
                case 3:System.out.println("And the future day is Saturday"); break;
                case 4:System.out.println("And the future day is Sunday"); break;
                case 5:System.out.println("And the future day is monday"); break;
                case 6:System.out.println("And the future day is Tuesday"); break;
            }
        }
        else if (days == 4) {
            System.out.println("Today is Thursday");
            switch (daysElapsed) {
                case 1:System.out.println("And the future day is Friday"); break;
                case 2:System.out.println("And the future day is Saturday");break;
                case 3:System.out.println("And the future day is Sunday"); break;
                case 4:System.out.println("And the future day is monday"); break;
                case 5:System.out.println("And the future day is Tuesday"); break;
                case 6:System.out.println("And the future day is Wednesday"); break;
            }
        }
        else if (days == 5) {
            System.out.println("Today is Friday");
            switch (daysElapsed) {
                case 1:System.out.println("And the future day is Saturday"); break;
                case 2:System.out.println("And the future day is Sunday");break;
                case 3:System.out.println("And the future day is monday"); break;
                case 4:System.out.println("And the future day is Tuesday"); break;
                case 5:System.out.println("And the future day is Wednesday"); break;
                case 6:System.out.println("And the future day is Thursday"); break;
            }
        }
        else if (days == 6) {
            System.out.println("Today is Saturday ");
            switch (daysElapsed) {
                case 1:System.out.println("And the future day is Sunday"); break;
                case 2:System.out.println("And the future day is monday");break;
                case 3:System.out.println("And the future day is Tuesday"); break;
                case 4:System.out.println("And the future day is Wednesday"); break;
                case 5:System.out.println("And the future day is Thursday"); break;
                case 6:System.out.println("And the future day is Friday"); break;
            }
        }

    }
}
