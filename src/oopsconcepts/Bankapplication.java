package oopsconcepts;
import java.util.Scanner;
interface Bankapp
{
	public void showdetails();
	public void balance();
	public void deposit();
	public void withdraw();
}
class Union implements Bankapp
{
int accountnumber;
static String bname="Canara Bank";
int bankbal=25000;
int d,w;
Scanner sc=new Scanner(System.in);
	@Override
	public void showdetails() {	
		System.out.println("Enter account number :");
		long accountnumber=sc.nextLong();
		System.out.println("Account Details:\n"+"accountnumber:"+accountnumber+"\nBank name:"+bname);		
	}
	@Override
	public void balance() {
		System.out.println("Bank Balance:"+bankbal);		
	}
	@Override
	public void deposit() {
		System.out.println("Enter the amount you want to deposit:");
		d=sc.nextInt();
		System.out.println("Total Bank Balance:"+(bankbal=d+bankbal));	
	}
	@Override
	public void withdraw() {
		System.out.println("Enter the amount you want to withdraw:");
		w=sc.nextInt();
		System.out.println("Total Bank Balance:"+(bankbal=bankbal-w));	
	}
	public void customerdetails(String name,int age,String address)
	{
		System.out.println("Customer Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Place:"+address);
	}
}
public class Bankapplication {
	public static void main(String[] args) {	
		Union ob=new Union();
		ob.showdetails();
		ob.customerdetails("Arun", 23, "Kakkanad");	
		ob.balance();
		ob.deposit();
		ob.withdraw();
	}
}
