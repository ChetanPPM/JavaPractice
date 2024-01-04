package test1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Chetan");
		al.add(12);
		al.add(10.5f);
		al.add('b');
		al.add("rahul");
		al.add(1222);
		al.add(120.5f);
		al.add('a');
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.remove(2));
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
