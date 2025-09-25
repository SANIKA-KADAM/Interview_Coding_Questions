/*Write a java program to swap first and last digits of a number */
import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // If single digit, no swap needed
        if (num < 10) {
            System.out.println("Swapped number: " + num);
            return;
        }

        int n = num;
        int lastDigit = n % 10;
        int firstDigit = 0;
        int placeValue = 1;

        // Find first digit and place value of most significant digit
        while (n >= 10) {
            n = n / 10;
            placeValue *= 10;
        }
        firstDigit = n;

        // Remove first and last digit part from number
        int middle = num % placeValue;  // remove first digit
        middle = middle / 10;           // remove last digit

        // Construct new number
        int swappedNum = lastDigit * placeValue + middle * 10 + firstDigit;

        System.out.println("Swapped number: " + swappedNum);
    }
}