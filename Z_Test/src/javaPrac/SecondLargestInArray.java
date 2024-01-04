package javaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargestInArray
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(Arrays.asList(42,45,778,331,35,6,68,88,3,2,5,78));
		System.out.println(al);
		System.out.println("After sort");
		Collections.sort(al);
		System.out.println(al+" ");
		int temp=al.size()-2;
		System.out.println("Second largest is  "+al.get(temp));
	}
}
