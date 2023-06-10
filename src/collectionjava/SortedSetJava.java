package collectionjava;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetJava {
	
	public static void main(String[] args)
	{
		TreeSet<String> treesetmet = new TreeSet<String>();
		treesetmet.add("This is Testing");
		treesetmet.add("Priya");
		treesetmet.add("Raha");
		treesetmet.add("Raj");
		treesetmet.add("@");
		treesetmet.add("Yogesh");
		treesetmet.addAll(treesetmet);
		Object test = 	treesetmet.clone();
		System.out.println(test);
		
	
String first = treesetmet.first();
	System.out.println(first);

	
	for (String desendingorder : treesetmet) 
	{
		Iterator test1 = treesetmet.descendingIterator();
		test1.next();
			System.out.println(desendingorder);
		
	}
	
	String lowervisible = treesetmet.lower(first);
	System.out.println(lowervisible);
	

	}
	

}
