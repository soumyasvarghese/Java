package problems;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int s=0,num,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        num=n;
        while (num>0)
        {
            r=num%10;
            s=s+(r*r*r);
            num = num / 10;
        }
        if (n==s)
        {
            System.out.println(s+" is armstrong number");
        }
        else
        {
            System.out.println(s+" is not armstrong number");
        }     
	}
}
