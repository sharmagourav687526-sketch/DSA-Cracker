package patternprinting;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = scanning.nextInt();

        System.out.print("Enter the number of columns : ");
        int columns = scanning.nextInt();

        // Fix 3A: Pre-size the capacity (rows * columns + 1 newline per row)
        int estimatedCapacity = rows * (columns + 1);
        StringBuilder solidRectangle = new StringBuilder(estimatedCapacity);

        // Fix 2: Get platform-independent line separator
        String lineSeparator = System.lineSeparator();

        // Fix 1: Use 0-based indexing (i < rows, j < columns)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                solidRectangle.append('*'); // Fix 3B: Use single quotes for char literal
            }
            solidRectangle.append(lineSeparator);
        }

        // Single output operation
        System.out.print(solidRectangle.toString());

        scanning.close();
    }
}