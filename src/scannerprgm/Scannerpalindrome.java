package scannerprgm;

import java.util.Scanner;

public class Scannerpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,s=0,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		t=n;    
		  while(n>0){    
		   r=n%10;   
		   s=(s*10)+r;    
		   n=n/10;    
		  }    
		if(t==s)    
			   System.out.println("Number is palindrome ");    
			  else    
			   System.out.println("Number is not palindrome");  
		
	}
}
