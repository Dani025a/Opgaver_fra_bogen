package Kapitel_06;

public class Opgave_6_01 {

    public static void main(String[] args) {

        final int PENTAGONAL_NUMBERS_PER_LINE = 10;

        for (int i = 0; i < 100; i++) {

            if (i % PENTAGONAL_NUMBERS_PER_LINE == 0) {
                System.out.println();
            }

            System.out.printf("%7d ", getPentagonalNumber(i));
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}

