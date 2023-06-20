package oopsconcepts;

public class Exceptionhandling {

	public static void main(String[] args) {
try
{
	int a=20,b=0;
	int c=a/b;
	System.out.println(c);
}
catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println("Arithmetic Exception ");
}
System.out.println("HELLO.....");
try
{
	int a[]=new int[2];
	a[0]=23;
	a[1]=34;
	System.out.println(a[3]);
}
catch(Exception e)
{
	System.out.println("Arrayindexboundofexception");

}
try {
	
String s=null;
System.out.println(s.length());
}
catch (Exception e)
{
	System.out.println("Null Exception");

}
	}

}
