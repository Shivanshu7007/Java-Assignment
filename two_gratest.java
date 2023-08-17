// Write a program to find the largest of two numbers in java
import java.util.Scanner;
public class two_gratest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        if (num1 > num2)
        System.out.println("Num 1 is Greater");
        else if (num1 < num2)
        System.out.println ("Num 2 Is greater ");
        else
        System.out.println("Both are equal");        
    }
    
}
