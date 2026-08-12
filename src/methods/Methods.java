package methods;

import java.security.spec.RSAOtherPrimeInfo;

public class Methods {
    static void print2KaTable(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
    public static void main(String[] args) {
        System.out.println("hye");
        print2KaTable();
        System.out.println("Bye");

        sum2(3,4);
    }

    static void sum2(int a, int b){
        System.out.println("The sum of 2 numbers is : " + (a + b));
    }
}
