package oopsconcepts;
class Parentclass
{
	public void parent()
	{
		System.out.println("Parent class");
	}
}
class Subclass1 extends Parentclass
{
	public void child1()
	{
		System.out.println("Parent Class inherit Child 1");	
	}
}
class Subclass2 extends Parentclass
{
	public void child2()
	{
		System.out.println("Parent Class inherit Child 2");	
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {
		Subclass1 b=new Subclass1();
		b.child1();
		b.parent();
		Subclass2 c=new Subclass2();
		c.child2();
		c.parent();
		Accessmodifierprgm ob=new Accessmodifierprgm();
		System.out.println(ob.b);


	}

}
