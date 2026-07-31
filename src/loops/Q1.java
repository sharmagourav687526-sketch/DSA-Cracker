package loops;


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1 Print counting from 1 to n using for loop
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Q2 Print counting from n to 1 using for loop
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }


        // Q3 Print the 10 multiple of n

        System.out.println("\nThe 10 multiples of " + n + " are : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + n + " = " + (i * n));
        }

        // Q4 Print your name 100 times
        System.out.println("\nMy name is printed 100 times : ");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ". Gourav Sharma");
        }

        // Q5 Print all even numbers from 1 to 100
        System.out.println("All even numbers from 1 to 100 are : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // Q6 Print the Sum of all the numbers from 1 to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("\nSum of first " + n + " numbers is : " + sum);

        // Q7 Print all integers in range from 50 to 100, that are perfectly divisible by 7

        System.out.println("All integers in range from 50 to 100, that are perfectly divisible by 7 are : ");
        for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        // Q8 Print all Prime numbers from 1 to 100
        System.out.println("\nAll prime numbers from 1 to 100 are :");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j*j <= i; j++) {
            if (i  % j == 0) {
                isPrime = false;
                break;
            }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }


        sc.close();
    }
}