package patternprinting;

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = rows * (rows + 1) / 2 + rows;
        StringBuilder hollowPyramid = new StringBuilder();

        // get platform-independent line seperator
        String lineSeparator = System.lineSeparator();

        // Printing Hollow Pyramid


        for (int i = 1; i <= rows; i++) {
            // printing first part of spaces of inverted right angle tringle
            for (int j = 1; j <= rows - i; j++) {
                hollowPyramid.append("# ");
            }

            // printing the hollow pyramid
            for (int j = 1; j <= i * 2 - 1; j++) {
                // || j == (i * 2 )/2
                if (i == rows || j == 1 || j == i * 2 - 1 ) {
                    hollowPyramid.append("* ");
                } else {
                    hollowPyramid.append("  ");
                }
            }
            hollowPyramid.append(lineSeparator);
        }
        System.out.println(hollowPyramid);
        sc.close();
    }
}