package collectionjava;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueJava {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> data_prio= new PriorityQueue<String>();
		data_prio.add("Yogesh");
		data_prio.add("Ice");
		data_prio.add("Govind");
		data_prio.add("Rajan");
		data_prio.add("Mahesh");
	

		System.out.println(data_prio);
		
		PriorityQueue<Integer> data_prio1= new PriorityQueue<Integer>();
		data_prio1.add(5);
		data_prio1.add(50);
		data_prio1.add(1);
		data_prio1.add(8);
		data_prio1.add(45);
		data_prio1.add(45);
		data_prio1.add(6);
		data_prio1.add(76);
		data_prio1.add(4);
		data_prio1.add(9);
		data_prio1.add(23);
		data_prio1.add(12);

		System.out.println(data_prio1);
		
		int a = data_prio1.poll();
		System.err.println(a);
		System.out.println(data_prio1);
		
		int  a1 = data_prio1.peek();
		System.err.println(a1);
		
		/*
		 * int we = data_prio1.remove(); System.out.println(we);
		 * System.out.println(data_prio1);
		 * 
		 * data_prio1.poll(); System.out.println(data_prio1);
		 */

	
	}

}
