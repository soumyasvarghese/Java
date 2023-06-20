package problems;
import java.util.Scanner;
public class Evenodd 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int a=sc.nextInt();
        int n=0,odd=0,even=0;
        System.out.println("Enter number: ");
        for(int i=1;i<=a;i++)
        {
        n=sc.nextInt();     
            if(n%2==0)
            {
                even=even+n;
            }
            else
            {
                odd=odd+n;
            }
        }
           System.out.println("Sum of even numbers: "+even);
           System.out.println("Sum of odd numbers: " +odd);
    }  
}      