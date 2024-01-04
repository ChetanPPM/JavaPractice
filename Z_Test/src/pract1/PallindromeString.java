package pract1;

import java.util.Scanner;

public class PallindromeString 
{
	public static void main(String[] args)
	{
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(s.equals(rev))
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
