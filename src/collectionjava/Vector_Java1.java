package collectionjava;

import java.util.Vector;

public class Vector_Java1 {

	
	public static void main(String[] args) {
		
		Vector <Integer> vec_list  = new Vector <Integer>();
		vec_list.add(12);
		vec_list.add(2511);
		vec_list.add(1);
		vec_list.add(2, 45);  // index .. value
		vec_list.add(100);

		int size_element = vec_list.size();
		System.out.println("the size count as "+size_element);
		

		vec_list.addAll(vec_list);
		System.out.println(vec_list);
		
		int count_capa = vec_list.capacity();
		System.out.println("The vector capacity as " +count_capa);

		
		vec_list.insertElementAt(34, 1);
		System.out.println("The insert element as " +vec_list);
		
	int check_first =vec_list.firstElement();
	System.out.println("The first element as " +check_first);
	
	int check_last =vec_list.lastElement();
	System.out.println("The last element as " +check_last);
	
	int lastindex = vec_list.lastIndexOf(2323, 5);
	System.out.println(lastindex);
	
	
	
	
	vec_list.setElementAt(251111993, 5);
	System.out.println(vec_list);
	
	vec_list.setElementAt(251111993, 0);
	System.out.println(vec_list);
	
	
	
		
	}
}
