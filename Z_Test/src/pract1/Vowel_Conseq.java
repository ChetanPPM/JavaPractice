package pract1;

import java.util.Scanner;

public class Vowel_Conseq 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int vowel=0;
		int cons=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u')
			{
				vowel++;
			}
			else if (ch!=' '){
				cons++;
			}
		}
		System.out.println("Vowel are--> "+vowel);
		System.out.println("conseq are--> "+cons);

	}
}
