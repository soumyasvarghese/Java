package controlstatement;

public class Naturalnum {

	public static void main(String[] args) {
		int n=10,s=0;
		System.out.print(" First 10 numbers is:\n ");
		for(int i=1;i<=n;i++)
		{
			 System.out.print(i + " ");
	            s += i;
	        }
	        System.out.println();
		System.out.println("Sum of first 10 natural number:"+s);
	}
}
