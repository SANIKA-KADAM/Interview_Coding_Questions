import java.util.*;
public class FirstLastDigit {
   public static void main(String args []){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scan.nextInt();

    int temp = Math.abs(num);

    int lastDigit = temp % 10;

    int firstDigit = temp;
    while (firstDigit >= 10) {
        firstDigit = firstDigit / 10;
    }

    System.out.println("First digit of " + num + "=" + firstDigit);
    System.out.println("Last digit of " + num + "=" + lastDigit);
   } 
}
