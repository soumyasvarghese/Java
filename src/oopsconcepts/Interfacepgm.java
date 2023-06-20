package oopsconcepts;
interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();
}
interface Creditcard
{
	public void creditcarddetails();
	
}
class SBI implements Bank,Creditcard
{

	@Override
	public void deposit() {
		System.out.println("SBI Deposite");
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI Withdrawal");
		
	}

	@Override
	public void balance() {
		System.out.println("SBI Balance");
		
	}

	@Override
	public void creditcarddetails() {
		// TODO Auto-generated method stub
		
	}

	
	
}
class Federal implements Bank
{

	@Override
	public void deposit() {
		System.out.println("Federal Deposite");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Federal Withdrawal");
		
	}

	@Override
	public void balance() {
		System.out.println("Federal Balance");
		
	}
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		Bank ob= new SBI();
		ob.deposit();
		ob.withdraw();
		ob.balance();
		
		ob=new Federal();
		

	}

}
