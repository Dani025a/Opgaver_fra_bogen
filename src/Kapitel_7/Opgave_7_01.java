package Kapitel_7;

import java.util.Scanner;

public class Opgave_7_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the nubmer of students: ");
        int[] numberOfStudents = new int[input.nextInt()];
        char[] grades = new char[numberOfStudents.length];

        System.out.print("Enter " + numberOfStudents.length + " scores: ");
        for (int i = 0; i < numberOfStudents.length; i++) {
            numberOfStudents[i] = input.nextInt();
        }

        // Get grades
        getGrades(numberOfStudents, grades);

        // Display results
        for (int i = 0; i < numberOfStudents.length; i++) {
            System.out.println("Student " + (i + 1) + " score is " +
                    numberOfStudents[i] + " and grade is " + grades[i]);
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void getGrades(int[] numberOfStudents, char[] grades) {
        int best = max(numberOfStudents);
        for (int i = 0; i < numberOfStudents.length; i++) {
            if (numberOfStudents[i] >= best - 10)
                grades[i] = 'A';
            else if (numberOfStudents[i] >= best - 20)
                grades[i] = 'B';
            else if (numberOfStudents[i] >= best - 30)
                grades[i] = 'C';
            else if (numberOfStudents[i] >= best - 40)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }
    }
}
