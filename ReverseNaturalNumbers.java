import java.util.*;
public class ReverseNaturalNumbers {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n = scan.nextInt();

    
    System.out.println("Natural numbers from" + n + " to 1:");
    
    while (n >=1){
        System.out.println(n + "");
        n--;
    }

}
}
