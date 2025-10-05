
/*Write a java program to print all ASCII character with their values. */
import java.util.*;
public class AsciiValue{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("ASCII Characters and their Values: ");
System.out.println("----------------------------------");
for (int i = 0; i <= 127; i++) {
            System.out.println(i + " : " + (char) i);

}
}
}