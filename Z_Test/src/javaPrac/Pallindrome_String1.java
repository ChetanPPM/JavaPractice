package javaPrac;

import java.util.Scanner;

public class Pallindrome_String1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a String");
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
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
