package test1;

public class Test3 
{
	public static void main(String[] args) {
		String s=null;
		try 
		{
		System.out.println(s.length());
		}
		catch (NullPointerException e) 
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Executed");
		}
	}

}
