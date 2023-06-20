package arrayprogram;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar=new int[10];
		int  sum = 0,n,i ;
		float  avg = 0;
	     System.out.print("Enter numbers:");
	      n=sc.nextInt();
	    
	        System.out.print("Enter the Array of Element : \n") ;
	        for ( i = 0 ; i <n ; i++)
	        {
	        	ar[i]=sc.nextInt();
	            sum = sum + ar[i] ;
	        }
	        System.out.println("\n Sum of Element of Array is : "+sum) ;
	        avg = sum / n ;
	        System.out.println("\n Average of Element of Array are : "+avg) ;

	}

}
