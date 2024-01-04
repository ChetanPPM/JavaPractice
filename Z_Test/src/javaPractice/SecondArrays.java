package javaPractice;

import java.util.Arrays;

public class SecondArrays
{
	public static void main(String[] args) 
	{
		int ar[]= {13,12,3,5,6,8,8,0,44,331};
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
			
		}
		System.out.println("\n");
		System.out.print("After sort");
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
			
		}
		int temp=ar.length-2;
		System.out.println("\n Second largest is-->"+ar[temp]);
	}

}
