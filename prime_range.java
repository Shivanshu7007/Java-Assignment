//Prime number within a given range
import java.util.Scanner;
public class prime_range {
    public static void main(String[] args) {
        int a,b,j;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Min limit");
        a=sc.nextInt();
        System.out.println("Enter the Max limit");
        b=sc.nextInt();
        for(int i=a; i<=b; i++)
        {
            for(j=2; j<i; j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.print(j+" ");   
        }
    }
        
}
