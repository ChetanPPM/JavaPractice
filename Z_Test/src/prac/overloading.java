package prac;

public class overloading
{
	public int add(int a,int b)
	{
	  int num=a;
	  int num2=b;
	  return a+b;
	}

	public int add(int a,int b,int c)
	{
	  int num=a;
	  int num2=b;
	  int num3=c;
	  return a+b+c;
	}
	public static void main(String[] args) 
	{
		overloading obj=new overloading();
		int res = obj.add(22, 44);
		System.out.println(res);
	}
}
