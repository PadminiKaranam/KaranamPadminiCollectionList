package list;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingValues {
	
	public void removeValue(ArrayList<Integer> arr)
	{
		arr.remove(1);
		arr.remove(5);
		arr.remove(10);
		System.out.println("After removing values the list is:");
		Iterator<Integer> i = arr.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+"  ");
		}
		System.out.println();
	}

}
