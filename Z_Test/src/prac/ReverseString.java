package prac;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s="chetan";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(s);
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
