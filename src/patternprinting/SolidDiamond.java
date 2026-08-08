package patternprinting;

import java.util.Scanner;

public class SolidDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        // Pre-size the capacity (rows * (rows + 1) / 2 + rows newlines)
        int estimatedCapacity = rows * (rows + 1) / 2 + rows;
        StringBuilder solidDiamond = new StringBuilder();

        // get platform-independent line seperator
        String lineSeparator = System.lineSeparator();


        // Printing solid diamond

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                solidDiamond.append(' '); // Use single quotes for char literal
            }

            for (int j = 0; j < ((i * 2) - 1); j++) {
                solidDiamond.append('*'); // Use single quotes for char literal
            }
            solidDiamond.append(lineSeparator);
        }

        int columns = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                solidDiamond.append(' '); // Use single quotes for char literal
            }
            for (int j = 0; j < ((columns * 2) - 1); j++) {
                solidDiamond.append('*');// Use single quotes for char literal
            }
            columns--;

            solidDiamond.append(lineSeparator);
        }

        System.out.println(solidDiamond);
        sc.close();
    }
}