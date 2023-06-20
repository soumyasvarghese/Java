package oopsconcepts;
class Member
{
	String name,address;
	int age;
	long phoneno;
	double salary;
	
public void printdetails(String name,int age,long phoneno,String address,double salary)
{
	 System.out.println("Name:"+name);
	 System.out.println("Age:"+age);
	 System.out.println("Phone number:"+phoneno);
	 System.out.println("Address:"+address);
	 System.out.println("Salary:"+salary);	 
}
}
class Employee extends Member
{
	public void specialization()
	{
		String specialization;
		System.out.println("Specialization:");

	}
}
class Manager extends Member
{
	public void department()
	{
		String department;
		System.out.println("Developer");
	}
}
public class Inheritanceprogram {

	public static void main(String[] args) {
		
		Manager m=new Manager();
		System.out.println("Manager Details:\n");
		m.printdetails("Anu", 35, 98765431, "Street1", 50000);
		m.department();
		System.out.println("\nEmployee Details:\n");
		Employee e=new Employee();
		e.printdetails("Manu", 25, 98765661, "Kakkanad", 25000);
		e.specialization();

	}

}
