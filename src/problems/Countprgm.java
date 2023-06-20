package problems;
import java.util.Scanner;
public class Countprgm {

	public static void main(String[] args) {
		int neg=0,pos=0,zero=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int l=sc.nextInt();
		System.out.println("Enter number:");
		for(int i=1;i<=l;i++)
		{
			int n=sc.nextInt();
		if(n<0)
		{
			neg++;
		}
		if(n==0)
		{
			zero++;
		}
		if(n>0)
		{
			pos++;
		}
		}
		System.out.println("Count of positive numbers: "+pos);
		System.out.println("Count of negative numbers: "+neg);
		System.out.println("Count of zero's: "+zero);
	}
}
