import java.util.Scanner;
public class sum_range_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range number ");
        int a = sc.nextInt();
        System.out.println("Enter ending range number");
        int b = sc.nextInt();
        int sum=0;
        for (int i=a; i<=b; i++)
        sum += i;
        System.out.println(sum);        
    }    
}
