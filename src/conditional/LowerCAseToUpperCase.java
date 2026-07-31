package conditional;

import java.util.Scanner;

public class LowerCAseToUpperCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character :");
        char a = sc.next().charAt(0);

        if (!(a >= 97 && a <= 122)) {
            System.out.println("The character is not a lowercase letter");
        }
        else if(Character.isLowerCase(a)){
            System.out.println(Character.toUpperCase(a));
        }
    }
}

