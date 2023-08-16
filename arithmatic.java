import java.util.Scanner;
public class arithmatic{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("The Sum Is "+(a+b));
        System.out.println("The dif Is "+(a-b));
        System.out.println("The product Is "+(a*b));
        System.out.println("The div Is "+(a/b));
        System.out.println("The rem Is "+(a%b));
        System.out.println("The rem Is "+(a*a*a));        
    }
}
