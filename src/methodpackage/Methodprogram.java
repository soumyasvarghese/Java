package methodpackage;

public class Methodprogram {

	public static void main(String[] args) {
		Methodprogram ob=new Methodprogram();
		ob.add();
		System.out.println("Subtraction:"+ob.sub());
		System.out.println("Multiplication:"+ob.mul(20,10));
		ob.div(20,10);

	}
	//Method without returntype and without parameter
	public void add()
	{
		int a=20,b=10;
		int c=a+b;
		System.out.println("Sum:"+c);
	}
	
	//Method with returntype and without parameter
	public int sub()
	{
		int a=20,b=10;
		int c=a-b;
		return c;
	}
	
	//Method with returntype and with parameter
	public int mul(int a,int b)
	{
		int c=a*b;
		return(c);
	}
	
	////Method without returntype and with parameter
	public void div(double a,double b)
	{
		double c=a/b;
		System.out.println("Division:"+c);
	}

}
