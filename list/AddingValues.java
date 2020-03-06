package list;

import java.util.ArrayList;
import java.util.Iterator;

public class AddingValues {
	public void addValue(ArrayList<Integer> arr)
	{
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		System.out.println("After adding values the list is:");
		Iterator<Integer> i = arr.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+"  ");
		}
		System.out.println();
	}

}
