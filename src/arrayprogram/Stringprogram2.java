package arrayprogram;

import java.util.Scanner;

public class Stringprogram2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter String:");
	     String s=sc.nextLine();
	     int count=0;
	     for(int i=0;i<s.length();i++)
	     {
	    	 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	    	 {
	    		 count++;
	    		 System.out.println(s.charAt(i));
	    	 }
	     }
	     System.out.println("No:of vowels is:"+count);

	}

}
