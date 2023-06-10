package collectionjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public interface CollectionJavaa_List_ArrayList 
{

	public static void main(String[] args) {
	
		/*
		 * List <Integer> list_coll = new ArrayList(); list_coll.add(123);
		 * System.out.println("First Coll\t"+list_coll);
		 */
		
		List <String>list_coll1 = new ArrayList<String>();
		list_coll1.add("Yogesh");
		list_coll1.add("Kamra");
		list_coll1.add("Uddeshya");
		list_coll1.add("Kamra");
		list_coll1.add("DeepShikha");
		list_coll1.add("Singh");
		list_coll1.add("Kamra");
		System.out.println("Printed values as follows\n"+list_coll1);
		
		list_coll1.add(null);


		int get_size = list_coll1.size();
		System.out.println("Printed values of size as follows\n"+get_size);

		boolean check_list_status =  list_coll1.isEmpty(); 
		System.out.println("Printed values of size as follows\n"+get_size);
		
		Collections.sort(list_coll1);
		System.out.println(list_coll1);
		

		list_coll1.addAll(list_coll1);
		System.out.println(list_coll1);

		
		list_coll1.remove(5);
		System.out.println("Printed values after remove as follows\n"+list_coll1);
		
		list_coll1.removeAll(list_coll1);
		System.out.println("Printed values after removeall as follows\n"+list_coll1);
		
		list_coll1.clear();
		System.out.println("Printed values as follows\n"+list_coll1);
	
		
		//List list_coll6 = new ArrayList();

		


		ArrayList <String>list_coll8 = new ArrayList<String>();
		list_coll8.


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * List list_coll4 = new ArrayList<Integer>(); list_coll4.add(4);
		 * System.out.println("Fourth Coll\t"+list_coll4);
		 * 
		 * 
		 * List list_coll5= new ArrayList(); list_coll5.add("Kamra");
		 * System.out.println("Fifth Coll\t"+list_coll5);
		 */
		
		
		

		
		
}
}