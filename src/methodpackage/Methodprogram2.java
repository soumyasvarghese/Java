package methodpackage;

import java.util.Scanner;

public class Methodprogram2 {
int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		Methodprogram2 m=new Methodprogram2();
		System.out.println("Count:"+m.count(n));
		
	}
	public int count(int n)
	{
		int c=0,t;
		while(n>0)
		{
		t=n%10;
		c=c+t;
		n=n/10;

	}
		return c;
	}

}
