/* Write a java program to find frequency of each digit in a given integer. */

import java.util.*;
public class DigitFrequency {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter A number: ");
         int num = sc.nextInt();
          int[] freq = new int[10];
          int temp = num;

        // Count frequency
        while (temp > 0) {
            int digit = temp % 10;   // extract last digit
            freq[digit]++;           // increase count
            temp /= 10;              // remove last digit
        }

        // Print result
        System.out.println("Digit frequencies in " + num + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s).");
            }
        }

        sc.close();
    }
}


    

