package oopsconcepts;
class Animals
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}
	class Dogs extends Animals
	{
		public void breed()
		{
			System.out.println("Breed");
		}
	}
	class Babydog extends Dogs
	{
		public void babyfood()
		{
			System.out.println("Babyfood");
		}	
	}
public class Multilevelinheritance {

	public static void main(String[] args) {
		
		Babydog b=new Babydog();
		b.animalfood();
		b.breed();
		b.babyfood();

	}

}
