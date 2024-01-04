package test2;

import java.util.Scanner;

public class PallindromeString 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
			
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println(s+" Pallindrome");
		}
		else
		{
			System.out.println(s+" NOTPallindrome");

		}
	}
}
