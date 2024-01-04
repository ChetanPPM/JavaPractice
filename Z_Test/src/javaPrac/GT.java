package javaPrac;

public class GT 
{
	public void M1(int num) 
	{
	int a=num;
	System.out.println(a);
	}
	public int M2()
	{
	 int num=5;
	 return num;
	}
	public static void main(String[] args) 
	{
		GT gt1=new GT();
		int val = gt1.M2();
		gt1.M1(val);
	}
}
