package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargest 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(Arrays.asList(1,136,53,2,136,1245,78,53,3424,546,768,66));
		System.out.println(al);
		System.out.println("After sort");
		Collections.sort(al);
		System.out.println(al);
		int temp=al.size()-2;
		System.out.println("Second largest is -->"+al.get(temp));
	}
}
