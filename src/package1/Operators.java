package package1;

public class Operators {

	public static void main(String[] args) {
		//Arithmatic operators
		int a=10,b=5;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//Assignment operators
		int c=30,d=20;
		System.out.println("c+=d"+(c+=d));
		System.out.println("c-=d"+(c-=d));
		System.out.println("c*=d"+(c*=d));
		System.out.println("c/=d"+(c/=d));
		
		//Relational Operators
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//Logical Operators
		String username="abc";
		String pwd="123";
		System.out.println(username=="abc" && pwd=="123");
		System.out.println(username=="abc" || pwd=="1234");
		System.out.println(!(username=="abc"));
		
		//Unary Operators
		int d1=2;
		System.out.println(d1++);
		System.out.println(d1);
		System.out.println(d1--);
		System.out.println(d1);
		System.out.println(++d1);
		System.out.println(d1);
		System.out.println(--d1);
		System.out.println(d1);

		//Ternary Operators
		int n=20,m=10,num;
		num=n>m?n:m;
		System.out.println("Greater number is: "+num);
		
		


		
		
		
		

	}

}
