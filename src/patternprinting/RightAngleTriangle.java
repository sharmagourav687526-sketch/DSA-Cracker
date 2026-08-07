package patternprinting;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String args[]) {

        System.out.print("Enter the number of rows for the right angle triangle: ");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = rows * (rows + 1) / 2 + rows;
        StringBuilder RightAngleTriangle = new StringBuilder(estimatedCapacity);

        // Get platform-independent line seperator
        String lineSeperator = System.lineSeparator();

        // printing Right Angled Triangle using for loops

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                RightAngleTriangle.append('*'); // Use single quotes for char literal
            }
            RightAngleTriangle.append(lineSeperator);
        }

        System.out.println(RightAngleTriangle);

        input.close();
    }
}