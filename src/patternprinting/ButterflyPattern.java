package patternprinting;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = rows * (rows + 1) / 2 + rows;
        StringBuilder butterflyPattern = new StringBuilder();

        // get platform-independent line seperator
        String lineSeparator = System.lineSeparator();

        // Printing Butterfly Pattern
        int columns = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                butterflyPattern.append("*");
            }

            for (int j = 1; j < ((columns * 2) -1); j++) {
                butterflyPattern.append(' ');// Use single quotes for char literal
            }
            columns--;
            for (int j = 1; j <= i; j++) {
                butterflyPattern.append("*");
            }
            butterflyPattern.append(lineSeparator);


//            // printing first part of spaces of inverted right angle tringle
//            for (int j = 1; j <= i; j++) {
//                butterflyPattern.append("* ");
//            }
//
//            // printing the hollow pyramid
//            for (int j = 1; j <= (rows - i) * 2; j++) {
//                butterflyPattern.append("  ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                butterflyPattern.append("* ");
//            }
//            butterflyPattern.append(lineSeparator);
        }

        columns = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                butterflyPattern.append("*");
            }

            for (int j = 1; j < ((i * 2) -1) ; j++) {
                butterflyPattern.append(' ');
            }

            for (int j = i; j <= rows; j++) {
                butterflyPattern.append("*");
            }
            butterflyPattern.append(lineSeparator);
        }
//        for (int i = rows; i >= 1; i--) {
//            // printing first part of spaces of inverted right angle tringle
//            for (int j = 1; j <= i; j++) {
//                butterflyPattern.append("* ");
//            }
//
//            // printing the hollow pyramid
//            for (int j = 1; j <= (rows - i) * 2; j++) {
//                butterflyPattern.append("  ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                butterflyPattern.append("* ");
//            }
//            butterflyPattern.append(lineSeparator);
//        }

        System.out.println(butterflyPattern);
    }
}
