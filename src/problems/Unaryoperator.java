package problems;
public class Unaryoperator {

	public static void main(String[] args) {
		int a=12;
		
		//Post-increment Operator
		System.out.println("a="+(a++));
		System.out.println(a);
		
		//Post-decrement Operator
		System.out.println("a="+(a--));
		System.out.println(a);
		
		//Pre-increment Operator
		System.out.println("a=" +(++a));
		System.out.println(a);
		
		//Pre-decrement Operator
		System.out.println("a=" +(--a));
		System.out.println(a);
	}
}
