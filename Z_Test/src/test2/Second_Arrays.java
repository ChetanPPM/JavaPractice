package test2;

import java.util.Arrays;

public class Second_Arrays 
{
	public static void main(String[] args)
	{
		int ar[]= {9,7,5,32,46,2,6,8,52};
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
		System.out.println("Second largests is"+" -->"+ar[temp]);
	}
}
