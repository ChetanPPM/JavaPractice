package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLIst 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList(Arrays.asList(12,34,35,7,8,13,5,7,86,43,4));
		Collections.sort(al);
		int count=al.size()-2;
		System.out.println("Secomd "+al.get(count));
	}
}
