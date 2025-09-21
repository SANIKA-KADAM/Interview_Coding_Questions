/*Write a ajava program to print all odd number between 1 to 100. */

public class OddNumbers {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("odd numbers from 1 to 100");
        while(i<=100){
            System.out.println(i + "");
            i += 2;
        }

    }
}
/*Write a C program to print all odd number between 1 to 100. Using for loop with % operator 

public class OddNumbers {
    public static void main(String[] args) {
        
        System.out.println("odd numbers from 1 to 100");

        for(i = 1; i <= 100; i++){
            if(i % 2 != 0){
            System.out.println(i + "");
        
        }

    }
}
}
*/