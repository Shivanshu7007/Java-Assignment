// Write a program to find the largest of three numbers in java
import java.util.Scanner;
public class three_greatest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        int num2=sc.nextInt();
        System.out.println("Enter Third Number");
        int num3=sc.nextInt();
        if (num1 > num2 && num1 > num3)
        System.out.println("Num 1 is Greater");
        else if (num2 > num3 && num2 > num1)
        System.out.println ("Num 2 Is Greater ");
        else if (num3 > num2 && num3 > num1)
        System.out.println("Num 3 Is Greater");
        else
        System.out.println("All Numbers are Equal");
    }
    
}