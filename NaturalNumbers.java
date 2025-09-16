/*Write a  java program to print all natural numbers from 1 to n. - using while loop */

import java.util.Scanner;
public class NaturalNumbers{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the value of N :");
        int N = scan.nextInt();
         System.err.println("Natural numbers from 1 " + N + ":");

        int i = 1;
        while(i<=10){
          System.out.print(i + "");
        }
    }
}