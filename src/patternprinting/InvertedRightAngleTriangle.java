package patternprinting;

import java.util.Scanner;

public class InvertedRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the inverted right angle triangle: ");
        int rows = sc.nextInt();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = rows * (rows + 1) / 2 + rows;
        StringBuilder InvertedTriangle = new StringBuilder();

        // get platform-independent line seperator
        String lineSeparator = System.lineSeparator();

        // Printing Inverted Right Angle Triangle

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                InvertedTriangle.append('#'); // Use single quotes for char literal
            }
            InvertedTriangle.append(lineSeparator);
        }
        System.out.println(InvertedTriangle);
        sc.close();
    }
} 