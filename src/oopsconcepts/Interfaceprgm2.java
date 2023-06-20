package oopsconcepts;
interface basicanimal
{
public void eat();
public void sleep();
}
class Monkey
{
	public void jump()
	{
		System.out.println("Jump");
	
	}
	public void bite()
	{
		System.out.println("Bite");
	
	
	}
}
class Human extends Monkey implements basicanimal
{
	public void speak()
	{
		System.out.println("Speak");
	
	}

	@Override
	public void eat() {
		System.out.println("Eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleep");
		
	}

}



public class Interfaceprgm2 {

	public static void main(String[] args) {
	Human ob=new Human();
	ob.speak();
	ob.jump();
	ob.bite();
	ob.eat();
	ob.sleep();

	}

}
