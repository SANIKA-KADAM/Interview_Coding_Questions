/* write a java program the number uis pallidrome or not */

import java.util.*;
public class Pallidrome{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int reversed = 0;

        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversed){
            System.out.println(originalNum + " is a palidrome number.");
        }else {
            System.out.println(originalNum + " is not a a pallidrome number.");
        }
}
}