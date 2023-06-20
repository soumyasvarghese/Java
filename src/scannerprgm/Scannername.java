package scannerprgm;

import java.util.Scanner;

public class Scannername {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String a=sc.nextLine();
		sc.next();
		System.out.println("Name is "+a);

	}

}
