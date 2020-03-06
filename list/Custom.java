package list;
import java.util.*;

public class Custom {
      public static void main(String args[])
      {
    	  System.out.println("Array List");
    	  ArrayList<Integer> arr=new ArrayList<Integer>(10);
    	  for(int i=1;i<=10;i++)
    	  {
    		  arr.add(i);
    	  }
    	  
    	  FetchingList fl = new FetchingList();
    	  fl.fetch(arr);
    	  
    	  AddingValues av = new AddingValues();
    	  av.addValue(arr);
    	  
    	  RemovingValues rv = new RemovingValues();
    	  rv.removeValue(arr);
    	  
    	  PrintingValues pv = new PrintingValues();
    	  pv.printValue(arr);
    	  
      }
}
