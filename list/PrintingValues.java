package list;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintingValues {
	public void printValue(ArrayList<Integer> arr)
	{
		System.out.println("The values in list are:");
		Iterator<Integer> i = arr.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+"  ");
		}
		System.out.println();
	}

}
