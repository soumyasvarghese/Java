package problems;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		 int a=0,b=1,c;  
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number of terms: ");
	     int n=sc.nextInt();   
		 System.out.print("Fibonacci Series is:\n"+a+" "+b);
	     for(int i=2;i<n;++i) 
		 {    
		  c=a+b;    
		  System.out.print(" "+c);    
		  a=b;    
		  b=c;    
		 }    
	}
}