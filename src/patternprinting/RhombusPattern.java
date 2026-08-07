package patternprinting;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns : ");
        int columns = scanner.nextInt();

        // Pre-size the capacity (rows * columns + 1 newline per row)
        int estimatedCapacity = rows * (columns + 1);
        StringBuilder Rhombus = new StringBuilder(estimatedCapacity);

        // Get platform-independent line separator
        String lineSeparator = System.lineSeparator();

        // Use 0-based indexing (i < rows, j < columns)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i -1; j++) {
                Rhombus.append(' ');
            }

            for (int j = 0; j < columns; j++) {
                Rhombus.append('#'); // Use single quotes for char literal
            }
            Rhombus.append(lineSeparator);
        }

        // Single output operation
        System.out.print(Rhombus);

        scanner.close();
    }
}