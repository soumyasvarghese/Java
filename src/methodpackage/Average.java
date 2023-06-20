package methodpackage;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Average av=new Average();
		System.out.println("Average:"+av.avg(a,b,c));
		
	}
	public int avg(int a,int b,int c)
	{
		int s=a+b+c;
		int res=s/10; 
		return res;
	}
}
