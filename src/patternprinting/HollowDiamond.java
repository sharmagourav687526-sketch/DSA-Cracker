package patternprinting;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        // get platform-independent line seperator
        String lineSeparator = System.lineSeparator();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = 2 * rows * (2 * rows + lineSeparator.length());
        StringBuilder hollowDiamond = new StringBuilder();




        // Printing hollow diamond

        for (int i = 1; i <= rows; i++) {
            // printing first part of spaces of inverted right angle tringle
            for (int j = 1; j <= rows - i; j++) {
                hollowDiamond.append("  ");
            }

            // printing the hollow pyramid
            for (int j = 1; j <= i * 2 - 1; j++) {
                // || j == (i * 2 )/2
                if (j == 1 || j == i * 2 - 1 ) {
                    hollowDiamond.append("* ");
                } else {
                    hollowDiamond.append("  ");
                }
            }
            hollowDiamond.append(lineSeparator);
        }

        for (int i = rows-1; i >= 1; i--) {
            // printing first part of spaces of inverted right angle tringle
            for (int j = 1; j <= rows - i; j++) {
                hollowDiamond.append("  ");
            }

            // printing the hollow pyramid
            for (int j = (i * 2 -1); j >= 1; j--) {
                // || j == (i * 2 )/2
                if (j == 1 || j == i * 2 - 1 ) {
                    hollowDiamond.append("* ");
                } else {
                    hollowDiamond.append("  ");
                }
            }
            hollowDiamond.append(lineSeparator);
        }

        System.out.println(hollowDiamond);
        sc.close();
    }
}