package pract1;

import java.util.Scanner;

public class UpperLetter_Lower
{
	public static void main(String[] args) 
	{
		System.out.println("enter a String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int upp=0;
		int low=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>=65&&ch<=90)
			{
				upp++;
			}
			else if(ch>=97&&ch<=123)
			{
				low++;
			}
		}
		System.out.println("upper letter are--> "+upp);
		System.out.println("lower letter are--> "+low);

	}
}
