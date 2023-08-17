import java.util.Scanner;
public class sum_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of N");
        int n=sc.nextInt();
        /* n=n*(n+1)/2;
           System.out.println(n); */
        int sum =0;
        for (int i=1 ; i<=n ; ++i)
        sum += i;
        System.out.println(sum);
    }    
}
