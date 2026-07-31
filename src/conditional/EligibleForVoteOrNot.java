package conditional;

import java.util.Scanner;

public class EligibleForVoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");

        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Age cannot be negative");
        }
        else if (age > 120) {
            System.out.println("You should be \uD83D\uDC80☠\uFE0Fdead \uD83D\uDC80☠\uFE0Ffor now dude \uD83E\uDEE9!");
        }
        else
        if (age >= 18) {
            System.out.println("You are eligible for vote ✅");
        }
        else {
            System.out.println("You are not eligible for vote ❌");
        }
    }
}
