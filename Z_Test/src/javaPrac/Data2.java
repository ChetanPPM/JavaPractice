package javaPrac;

import java.util.Arrays;

public class Data2 
{
	public static void main(String[] args)
	{
		int ar[]= {3,4,5,6,2,24,65,31,5,6574,532,32};
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("After sort");
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int temp=ar.length-2;
		System.out.println("Second largest is-->"+ar[temp]);
	}
}
