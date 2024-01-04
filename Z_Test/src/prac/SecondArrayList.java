package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondArrayList
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList(Arrays.asList(10,24,35,58,3,75,9,9,3,22,2354,657,99,56,4));
		System.out.println(al);
		Collections.sort(al);
		int temp=al.size()-2;
		System.out.println(al);
		System.out.println(al.get(temp));
	}
}
