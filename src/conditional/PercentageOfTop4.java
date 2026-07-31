package conditional;
import java.util.Scanner;

public class PercentageOfTop4 {
    @SuppressWarnings("java:S106") // Suppress SonarQube warning for System.out
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minMark = Double.MAX_VALUE;
        double totalSum = 0;

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            double mark = scanner.nextDouble();
            totalSum += mark;
            if (mark < minMark) {
                minMark = mark;
            }
        }

        // Exclude the lowest mark
        double topFourSum = totalSum - minMark;

        // Calculate percentage (assuming max mark per subject is 100, total max = 400)
        double percentage = (topFourSum / 400.0) * 100;

        System.out.printf("Overall Percentage (Top 4): %.2f%%\n", percentage);

        scanner.close();
    }
}