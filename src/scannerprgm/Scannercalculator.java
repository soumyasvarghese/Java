package scannerprgm;

import java.util.Scanner;

public class Scannercalculator {

	public static void main(String[] args) {
		int res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an operation: \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
	    char op = sc.next().charAt(0);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		switch(op)
		{
		case '1': System.out.println("Addition of " + a + " + " + b + " = " + (res = a + b));
			      break;
		case '2': System.out.println("Subtraction of " + a + " - " + b + " = " + (res = a - b));
	              break;
		case '3': System.out.println("Multiplication of " + a + " * " + b + " = " + (res = a * b));
	              break;
		case '4': if(b==0)
		          {
			      System.out.println("Error.....!");
		          }
			      System.out.println("Division of " + a + " / " + b + " = " + (res = a / b));
	              break;
		default:  System.out.println("Invalid Choice!");
		}
	  }
	}
