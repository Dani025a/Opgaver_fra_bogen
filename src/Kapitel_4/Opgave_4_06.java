package Kapitel_4;

public class Opgave_4_06 {
    public static void main(String[] args) {

        double r = 40;
        System.out.println("Three random points are ");

        double a = Math.random() * 360;
        double x = r * Math.cos(a);
        double y = r * Math.sin(a);
        System.out.println("(" + x + ", " + y + ")");

        a = Math.random() * 360;
        x = r * Math.cos(a);
        y = r * Math.sin(a);
        System.out.println("(" + x + ", " + y + ")");

        a = Math.random() * 360;
        x = r * Math.cos(a);
        y = r * Math.sin(a);
        System.out.println("(" + x + ", " + y + ")");
    }
}
