package pract1;

import java.util.Scanner;

public class prime 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not");
		}
	}

}
