package selenium;

import java.util.Scanner;

public class PallNum
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int rem,rev=0;
		int temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("Pallindrome");
	
		}
		else
		{
			System.out.println("Not");
		}
	}
}
