//Armstrong number in a given range
import java.util.Scanner;
public class armstrong_number_range 
{
public static void main(String args[])
{
int num1, num2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
num1 = sc.nextInt();
System.out.println("Enter the second number");
num2 = sc.nextInt(); 
for (int i = num1; i<num2; i++)
{
int n, r, arm = 0;
n = i;
while(n != 0) 
{
r = n % 10;
arm = arm + (r*r*r);
n = n / 10;
}
if(arm == i)
{
System.out.println(""+i+" is an Armstrong number.");
}
}
}
}