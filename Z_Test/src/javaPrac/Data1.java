package javaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Data1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(Arrays.asList(12,32,564,6,3,21,5,65,331,322));
		System.out.println(al);
		System.out.println("after sort");
		Collections.sort(al);
		System.out.println(al);
		int temp=al.size()-2;
		System.out.println("Second largest iss --> "+al.get(temp));
	}
}
