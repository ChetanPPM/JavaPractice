package test1;

public class Exception {

	public static void main(String[] args) 
	{
		int a=0;
		int b=10;
		try 
		{
		int c=a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println(a);
	}

}
