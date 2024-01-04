package prac;

import java.util.Arrays;

public class ArraySecond 
{
	public static void main(String[] args)
	{
		int [] ar= {1,3,5,6,44,7,7,9,5,4,3};
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("\n");
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("\n");
		System.out.println(ar[ar.length-2]);
	}
}
