package Practice3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			 
			 
			 
			    // Create a LinkedList
			    LinkedList<String> list = new LinkedList<String>();
			 
			    // Add elements to LinkedList
			    list.add("Item1");
			    list.add("Item2");
			    list.add("Item3");
			    list.add("Item4");
			    list.add("Item5");
			    list.add("Item6");
			    list.add("Item7");
			 
			    // Displaying LinkedList elements
			    System.out.println("LinkedList elements:");
			    Iterator it= list.iterator();
			    while(it.hasNext()){
			       System.out.println(it.next());
			    }
			 
			    // Obtaining Sublist from the LinkedList
			    List sublist = list.subList(2,5);
		
			    
			    System.out.println(sublist);
	}
 
	                
}
