package lab7;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTester {

	public static void main(String[] args) 
	{
		//the next 13 lines initialize the two LinkedLists
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Tulsa");
		list1.add("Ada");
		list1.add("Broken Arrow");
		list1.add("Owasso");
		System.out.println(list1);
		//this adds OKC to the second position of list 1
		list1.add(1, "OKC");
		System.out.println(list1);
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("74104");
		list2.add("74135");
		list2.add("foo");
		list2.add("hello world");
		list2.add("777");
		System.out.println(list2);
		ListIterator<String> list1Iter = list1.listIterator();
		ListIterator<String> list2Iter = list2.listIterator();
		LinkedList<String> list3 = new LinkedList<String>();
		ListIterator<String> list3Iter = list3.listIterator();
		//this merges list 1 and list 2
		while(list1Iter.hasNext())
		{
			list3Iter.add(list1Iter.next());
			list3Iter.add(list2Iter.next());
		}
		System.out.println(list3);
		ListIterator<String> list3Itera = list3.listIterator();
		//removes every second element from list 3
		while(list3Itera.hasNext())
		{
			list3Itera.next();
			if(list3Itera.hasNext())
			{
				list3Itera.next();
				list3Itera.remove();
			}
			
		}
		System.out.println(list3);
		
		LinkedList<String> list4 = new LinkedList<String>();
		ListIterator<String> list4Iter = list4.listIterator();
		ListIterator<String> list2Itera = list2.listIterator();
		//makes the deep copy of list 2
		while(list2Itera.hasNext())
		{
			list4Iter.add(list2Itera.next());
		}
		System.out.println(list4);
	}

}
