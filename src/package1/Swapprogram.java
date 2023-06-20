package package1;

public class Swapprogram {

	public static void main(String[] args) {
		int a=20,b=10,temp;
		//Swap with third variable
		System.out.println("Before Swapping:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		//Swap without variable
		int a1=30,b1=20;
		System.out.println("Before Swapping:");
		System.out.println("a:"+a1);
		System.out.println("b:"+b1);
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		System.out.println("After Swapping:");
		System.out.println("a:"+a1);
		System.out.println("b:"+b1);

	}

}
