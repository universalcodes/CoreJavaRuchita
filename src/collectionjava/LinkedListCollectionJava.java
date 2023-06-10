package collectionjava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollectionJava 
{
	
	public static void main(String[] args)
	{
		
		LinkedList <String> list_coll1 = new LinkedList<String>();
			
			list_coll1.add("Yogesh");
			list_coll1.add("Singh");
			list_coll1.add("Yogesh");
			list_coll1.add("Rai");
			list_coll1.add("Yogesh");
			list_coll1.addLast("HP");
			Collections.sort(list_coll1);
			list_coll1.add("Mehra");
			list_coll1.add("Yogesh");
			list_coll1.add("Bachan");
			list_coll1.add("Yogesh");
			list_coll1.add("Kapoor");
			list_coll1.peek();
			System.out.println(list_coll1);
			list_coll1.add(null);

			
			
			list_coll1.push("Uddeshya");
			System.out.println(list_coll1);
			list_coll1.push("Deepshikha");
			System.out.println(list_coll1);
			list_coll1.pop();
			System.out.println(list_coll1);
			list_coll1.pop();
			System.out.println(list_coll1);
			list_coll1.pop();
			System.out.println(list_coll1);
			String peak_result = list_coll1.peek();
			System.out.println("peak\t"+peak_result);
			String peak_first_result = list_coll1.peekFirst();
			System.out.println("peakfirst\t"+peak_first_result);
			String peak_last_result = list_coll1.peekLast();
			System.out.println("peaklast\t"+peak_last_result);
			
			
			
			
	boolean check_data_status= list_coll1.containsAll(list_coll1);
			System.out.println("check_data_status for contains all\t"+check_data_status);
			
			

		
			System.out.println(list_coll1);
			list_coll1.add("Dell");
			list_coll1.addFirst("Laptop");
			



			System.out.println(list_coll1);

			
	
	LinkedList  list_coll2 = new LinkedList();

	list_coll2.add(546);
	list_coll2.add('R');
	list_coll2.add("Ruchita");
	list_coll2.add(null);


	 check_data_status= list_coll2.contains(list_coll2);
			System.out.println("check_data_status for contains without obj\t"+check_data_status);
	

		
			LinkedList <Object> list_coll3 = new LinkedList<Object>();

			list_coll3.add(546);
			list_coll3.add('R');
			list_coll3.add("Ruchita");

			 check_data_status= list_coll3.contai
				System.out.println("check_data_status for contains with obj\t"+check_data_status);
			
	

	
	
			

	}

}
