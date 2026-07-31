package conditional;

import java.util.Scanner;

public class UppercaseToLowercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char character = sc.next().charAt(0);

        if (!(character >= 65 && character <= 90)) {
            System.out.println("The character is not a UPPERCASE letter");
        }
        else if(Character.isUpperCase(character)){
            System.out.println(Character.toLowerCase(character));
        }
    }
}

