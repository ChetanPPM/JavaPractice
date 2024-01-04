package javaPrac;

import java.util.Arrays;

public class ArraysSecondlarge
{

	public static void main(String[] args)
	{
		int ar[]= {2,3,56,8,4,2,6,8,3,37,95};
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
		System.out.println("After sort");
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
		int temp=ar.length-2;
		System.out.println("Second largest  "+ar[temp]);
	}
}
