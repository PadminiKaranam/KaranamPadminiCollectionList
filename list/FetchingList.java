package list;

import java.util.ArrayList;

public class FetchingList {
	public void fetch(ArrayList<Integer> arr)
	{
		int value;
		System.out.println("Fetching the values in List:");
		for(int i=0;i<arr.size();i++)
		{
			value = arr.get(i);
			System.out.println("Value is:"+value);
		}
	}

}
