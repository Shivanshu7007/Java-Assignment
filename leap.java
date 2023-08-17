// Leap year program in Java
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Year");
        int yr=sc.nextInt();
        if (yr % 400 == 0)
        System.out.println ("is a Leap Year");
        else if (yr % 4 == 0 && yr % 100 != 0)
        System.out.println (" is a Leap Year");
        else
        System.out.println("is Not a Leap year");
    }   
}
