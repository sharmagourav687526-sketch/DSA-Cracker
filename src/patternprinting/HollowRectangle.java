package patternprinting;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        System.out.print("\nEnter the number of columns : ");
        int columns = sc.nextInt();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = rows * (rows + 1) / 2 + rows;
        StringBuilder HollowRectangle = new StringBuilder();

        // get platform-independent line seperator
        String lineSeparator = System.lineSeparator();

        // Printing Inverted Right Angle Triangle


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    HollowRectangle.append("# ");
                } else {
                    HollowRectangle.append("  ");
                }
            }
            HollowRectangle.append(lineSeparator);
        }
        System.out.println(HollowRectangle);
        sc.close();
    }
}