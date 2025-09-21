
/* Write a java program to find sum of all natural numbers between 1 to n.*/
import java.util.*;

public class SumNaturalNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Value of n :");
    int n = scan.nextInt();

    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
      System.out.println("Enter sum of Natural numbers from 1 to" + n + " is: "  + sum);


    } 
  }
}
