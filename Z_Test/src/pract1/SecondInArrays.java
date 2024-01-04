package pract1;

import java.util.Arrays;

public class SecondInArrays
{
	public static void main(String[] args)
	{
		int ar[]= {2,35,6,7,542,35,67,74};
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("after sort");
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println(ar.length);
		int temp=ar.length-2;
		System.out.println("second is --> "+ar[temp]);
	}
}
