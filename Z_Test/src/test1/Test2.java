package test1;

public class Test2 
{
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try 
		{
		int c=a/b;
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Executed");
		}
	}

}
