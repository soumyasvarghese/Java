package scannerprgm;

import java.util.Scanner;

public class Scannersum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		
		System.out.println("Sum is "+c);
	}

}
