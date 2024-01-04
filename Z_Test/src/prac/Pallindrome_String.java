package prac;

import java.util.Scanner;

public class Pallindrome_String 
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
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("Not Pall");
		}
	}
}
