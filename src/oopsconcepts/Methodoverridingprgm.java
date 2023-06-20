package oopsconcepts;

class Car
{
	public void speed()
	{
		System.out.println("Speed");
	}
}
class BMW extends Car
{
	@Override
	public void speed()
	{
		System.out.println("Speed of BMW is 140kmph");
		super.speed();
	}
}
class Audi extends BMW
{
	@Override
	public void speed()
	{
		System.out.println("Speed of Audi is 100kmph");
		super.speed();
	}
}


public class Methodoverridingprgm {

	public static void main(String[] args) {
	Audi a=new Audi();
	a.speed();
	

	}

}
