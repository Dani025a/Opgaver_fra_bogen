package Kapitel_2;

import java.text.DecimalFormat;

public class Opgave_2_18 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("   a       b    Middle Point");
        System.out.println("(0, 0)  (2, 1)   " + "(" + df.format((0+2)/2) + ", " + df.format((0+1)/2) + ")");
        System.out.println("(1, 4)  (4, 2)   " + "(" + df.format((1+4)/2) + ", " + df.format((4+2)/2) + ")");
        System.out.println("(2, 7)  (6, 3)   " + "(" + df.format((2+6)/2) + ", " + df.format((7+3)/2) + ")");
        System.out.println("(3, 9)  (10, 5)  " + "(" + df.format((3+10)/2) + ", " + df.format((9+5)/2) + ")");
        System.out.println("(4, 11) (12, 7)  " + "(" + df.format((4+12)/2) + ", " + df.format((11+7)/2) + ")");





    }
}
