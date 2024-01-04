package selenium;

public class PN
{
	public static void main(String[] args)
	{
		int num=121;
		int temp=num;
		int rev=0,rem;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
