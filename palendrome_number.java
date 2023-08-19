// Palindrome number
import java.util.Scanner;
public class palendrome_number{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num,rev=0, z;
        System.out.println("Enter a number");
        num =sc.nextInt();
        z=num;
        while(num>0)
        {
         rev = (rev*10)+num%10;
         num = num/10;
        }
        if(rev == z)
        System.out.println("is a Palindrome");
        else
        System.out.println("Not a Palindrome");
    }
}
