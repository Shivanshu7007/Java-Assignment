//Reverse a given number in Java
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,r;
        System.out.println("Enter the Number");
        n=sc.nextInt();
        while(n!=0)
        {
         r=n%10;
         n=n/10;
         System.out.print(r);
        }
    }
    
}
