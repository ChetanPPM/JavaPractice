package prac;

public class Dogs extends Animal
{
	public void eats() 
	{
		System.out.println("Eating Breads");
	}
	public static void main(String[] args) {
		Dogs d=new Dogs();
		d.eats();
	}
}
