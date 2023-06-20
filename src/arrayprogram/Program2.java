package arrayprogram;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		int[] ar=new int[3];
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter numbers:");
	     for(int i=0;i<3;i++)
	 	{
	        ar[i]=sc.nextInt();
	 	}
	     System.out.print("Numbers is:\n");
	     for(int i=0;i<3;i++)
	 	{
	 		System.out.println(ar[i]);
	 	}
	}
}