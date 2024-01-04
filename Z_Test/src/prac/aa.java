package prac;

public class aa 
	{
	public static void main(String[] args)
	{
		int num=191;
		int temp=num;
		int rev=0;
		int rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
	}
	}
