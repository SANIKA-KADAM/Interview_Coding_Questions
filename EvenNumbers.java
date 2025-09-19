/*Write a java program to print all even numbers between 1 to 100. - using while loop */

import java.util.*;
public class EvenNumbers{
    public  static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Even Numbers from 1 to 100");
        int i = 2;
        while(i<=100){
            System.out.println(i + "");
            i += 2;
        }

    }
}
