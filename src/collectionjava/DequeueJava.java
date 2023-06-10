package collectionjava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DequeueJava {

	public static void main(String[] args) {
		
		Deque <String> data_prio= new ArrayDeque <String>();
		data_prio.add("Yogesh");
		data_prio.add("Ice");
		data_prio.add("Govind");
		data_prio.add("Rajan");
		data_prio.add("Mahesh");
		
	

		System.out.println(data_prio);
		
		data_prio.add("Yogesh");
		data_prio.add("Ice");
		data_prio.add("Govind");
		data_prio.add("Rajan");
		data_prio.add("Mahesh");
		data_prio.add("Yogesh");
		data_prio.add("Ice");
		data_prio.add("Govind");
		data_prio.add("Rajan");
		data_prio.add("Mahesh");
		
		System.out.println(data_prio);
		
		String poll_first = data_prio.pollFirst();
		System.out.println(poll_first);
		
		String poll_last = data_prio.pollLast();
		System.out.println(poll_last);
		
		String peek_first = data_prio.peekFirst();
		System.out.println(peek_first);
		
		String peek_last = data_prio.peekLast();
		System.out.println(peek_last);


	}
}
