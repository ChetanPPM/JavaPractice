package overriding;

public class Dog extends Animal
{
	public void dog()
	{
		System.out.println("Eats Breads");
	}
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.dog();
		
	}
}
