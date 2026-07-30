package conditional;

import java.util.Scanner;

public class conditinals {
    public static void main(String[] args) {
        int dailyPractice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours you have practiced coding in a day :");
        dailyPractice = sc.nextInt();
        if (dailyPractice >= 6) {
            System.out.println("you are doing good");
        }
        else {
            System.out.println("you are not doing good");
        }
    }
}
