package patternprinting;

import java.util.Scanner;

public class HollowRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = rows * (rows + 1) / 2 + rows;
        StringBuilder HollowRightAngleTriangle = new StringBuilder();

        // get platform-independent line seperator
        String lineSeparator = System.lineSeparator();

        // Printing Hollow Right Angle Triangle


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == 1 || i == rows || j == i) {
                    HollowRightAngleTriangle.append("# ");
                } else {
                    HollowRightAngleTriangle.append("  ");
                }
            }
            HollowRightAngleTriangle.append(lineSeparator);
        }
        System.out.println(HollowRightAngleTriangle);
        sc.close();
    }
}