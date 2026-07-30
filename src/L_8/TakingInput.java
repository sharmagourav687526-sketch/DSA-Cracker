package L_8;

import java.math.BigInteger;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first number :");
        int first = sc.nextInt();
        System.out.println("Enter the value of second number :");
        int second = sc.nextInt();
        System.out.println("Sum of a and b is " + (first + second));

        System.out.println("Enter a Big integer value :");
        BigInteger bi = sc.nextBigInteger();
        System.out.println("Big Integer is " + bi);
        
        System.out.println("Enter a float value :");
        float floatValue = sc.nextFloat();
        System.out.println("Float value is " + floatValue);

        System.out.println("Enter a boolean value :");
        boolean flag = sc.nextBoolean();
        System.out.println("Boolean value is " + flag);

        System.out.println("Enter a double value :");
        double doubleValue = sc.nextDouble();
        System.out.println("double value is " + doubleValue);

        System.out.println("Enter a long value :");
        long longValue = sc.nextLong();
        System.out.println("Long value is " + longValue);

        sc.close();
    }
}