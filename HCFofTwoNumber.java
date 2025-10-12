/*Write a java program to find HCF (GCD) of two numbers */

import java.util.*;

public class HCFofTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        // Using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + a);

        sc.close();
    }
}


