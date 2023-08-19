import java.util.Scanner;
public class armstrong_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,arm=0,c,r;
        System.out.println("Enter a number");
        n =sc.nextInt();
        c = n;
        while(n>0)
        {
            r = n%10;
            arm = (r*r*r)+arm;
            n = n/10;
        }
        if(arm==c)
        {
            System.out.println("is armstrong number");
        }
        else
        {
            System.out.println("not an armstrong number");
        }
    }
}