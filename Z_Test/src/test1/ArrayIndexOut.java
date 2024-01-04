package test1;

public class ArrayIndexOut
{
	public static void main(String[] args)
	{
		int ar[]= {10,20,30};
		try
		{
		System.out.println(ar[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("exception is-->"+e);
		}
	}
}
