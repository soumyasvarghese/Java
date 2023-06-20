package oopsconcepts;

public class Methodoverloadingprgm {

	public static void main(String[] args) {
		Methodoverloadingprgm ob=new Methodoverloadingprgm();
		ob.add();
		ob.add(10, 20);
		ob.add(30, 20.5);
		ob.add(23.6, 30);
		

	}
	public void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Sum Of "+a+" + "+b+"= "+c);
	}

	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum Of "+a+" + "+b+"= "+c);
	}

	public void add(int a,double b)
	{
		double c;
		c=a+b;
		System.out.println("Sum Of "+a+" + "+b+"= "+c);
	}

	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println("Sum Of "+a+" + "+b+"= "+c);
	}

}
