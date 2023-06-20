package methodpackage;

public class Shapes {

	public static void main(String[] args) {
		Shapes s=new Shapes();
		s.triangle();
		System.out.println("Area of rectangle:"+s.rectangle());
		System.out.println("Area of circle:"+s.circle(2));
		s.square(2);

	}
	//Method without return type and without parameter
	public void triangle()
	{
		int b=10,h=5;
		double tri=0.5*b*h;
		System.out.println("Area of triangle:"+tri);
	}
	
	//Method with return type and without parameter
	public int rectangle()
	{
		int l=10,b=5;
		int rec= l*b;
		return rec;
	}
	
	//Method with return type and with parameter
	public double circle(double r)
	{
		double c=3.14*r*r;
		return(c);
	}
	
	////Method without return type and with parameter
	public void square(int a)
	{
		double sq=a*a;
		System.out.println("Area of Square:"+sq);
	}

}
