package javaPrac;

import java.util.Scanner;

public class A_count 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Stmt");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a')
			{
				count++;
			}
		}
		System.out.println(count);
		System.out.println();
	}
}
