package pract1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SSecondInArrayaList 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList(Arrays.asList(22,34,56,8,2,34,8,44,478,9,92));
		System.out.println(al);
		System.out.println("After Sorting");
		Collections.sort(al);
		System.out.println(al);
		int temp=al.size()-2;
		System.out.println("Second largest is --> "+al.get(temp));
	}
}
