package patternprinting;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = rows * (rows + 1) / 2 + rows;
        StringBuilder pyramidPattern = new StringBuilder();

        // get platform-independent line seperator
        String lineSeparator = System.lineSeparator();

        // Printing Inverted Right Angle Triangle

        int columns = rows;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i-1; j++) {
                pyramidPattern.append(' '); // Use single quotes for char literal
            }
            for (int j = 0; j < ((columns * 2) -1); j++) {
                pyramidPattern.append('*');// Use single quotes for char literal
            }
            columns--;

            pyramidPattern.append(lineSeparator);
        }
        System.out.println(pyramidPattern);
        sc.close();
    }
}