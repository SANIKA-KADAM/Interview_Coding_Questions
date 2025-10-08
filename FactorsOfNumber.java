/*Write a Java program to find all factors of a number. */

import java.util.*;
public class FactorsOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Fcators of"+ number + "are:");
        
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }
}