/* Write a java program to calculate product of digits of a number.*/

import java.util.*;

public class ProductsOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int product = 1;


        while (num > 0){
            int digit = num % 10; // extract last digit
            product *= digit;     // multiply with product
            num /= 10;            // remove last digit
        }
        System.out.println("Product of digits =" + product);    }
}
