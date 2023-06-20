package oopsconcepts;
class Animal
{
	public void animalfood()
	{
		System.out.println("animalfood");
	}
}
	class Dog extends Animal
	{
		public void breed()
		{
			System.out.println("Breed");
		}
	}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.animalfood();
		d.breed();
		

	}

}
