package problems;
import java.util.Scanner;
public class Primenum 
{
	public static void main(String[] args) 
	{
		int i,c=0;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive integer:");
        int n=sc.nextInt();
        if (n <= 1) 
        {
          System.out.println("Please enter positive integer or number is greater than 1"); 
        }
        for (i = 1; i <= n / 2; i++) 
        {
          if (n % i == 0) 
          {
            c++;
          }
        }
        if (c>1) 
        {
            System.out.println(n+" is not prime number");
        }
        else 
        {
          System.out.println(n+" is prime number");
        }
        }
}