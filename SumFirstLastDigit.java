
/* Write a java program to find sum of first and last digit of a number*/
import java.util.*;

public class SumFirstLastDigit {
   public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number n:");
    int n = scan.nextInt();

    int lastDigit = n % 10;

    int firstDigit = n;
    while ( firstDigit >= 10) {
        firstDigit = firstDigit / 10;

    }
    int sum = firstDigit + lastDigit;

    System.out.println("First digit:" + firstDigit);
    System.out.println("Last digit:" + lastDigit);
    System .out.println("Sum of first and last digit :"+ sum);


   } 
}
