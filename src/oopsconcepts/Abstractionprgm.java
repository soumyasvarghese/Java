package oopsconcepts;
abstract class Car1
{
	abstract public void speedlimit();
	public void carengine()
	{
		System.out.println("Car Engine");
	}
}
class Maruti extends Car1
{

	@Override
	public void speedlimit() {
		System.out.println("Maruti Speed Limit");
}	
}
class Bmw extends Car1
{

	@Override
	public void speedlimit() {
		System.out.println("Maruti Speed Limit");
}	
}
public class Abstractionprgm {

	public static void main(String[] args) 
	{
	Maruti m=new Maruti();
	m.speedlimit();
	m.carengine();

	}

}
