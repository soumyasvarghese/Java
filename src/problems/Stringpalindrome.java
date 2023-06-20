package problems;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		String s;
		String r="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings:");
		s=sc.nextLine();
		int length=s.length();
		for(int i=(length-1);i>=0;i--)
		{
			r=r+s.charAt(i);
			//System.out.println("Reverse:"+r);
		}
		if(s.equals(r))
		{
			System.out.println("String is palindrome");
	
		}
		else
		{
			System.out.println("String is not palindrome");

		}

	}

}
