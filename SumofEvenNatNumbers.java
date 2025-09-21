/*Write a java program to find sum of all even numbers between 1 to n. */
import java.util.*;
public class SumofEvenNatNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value of n:");
         int n = scan.nextInt();

         int sum = 0;
         for(int i = 2; i <= n; i += 2){
           sum += i;

           System.out.println("Sum of even numbers from 1 to " + n + " is:" + sum);
         }
    }
}
