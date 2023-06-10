package collectionjava;

import java.util.Stack;

public class Stack_Java_1 {
	
	public static void main(String[] args) 
	{
		
		Stack<Object> insert_stack = new Stack<Object>();
		insert_stack.add(1);
		insert_stack.add(1);
		insert_stack.add(2);
		insert_stack.add(12);
		insert_stack.add("Yogesh");

		insert_stack.add(400);
		insert_stack.add(1);
		
		System.out.println(insert_stack);

		Object test = insert_stack.search("Yogesh");
		System.out.println(test);

		System.out.println(insert_stack);

		insert_stack.push(30);
		System.out.println(insert_stack);

		insert_stack.push(300);
		System.out.println(insert_stack);

		insert_stack.push(3000);
		System.out.println(insert_stack);
		insert_stack.add(100);

		insert_stack.push(30000);

		System.out.println(insert_stack);

		insert_stack.pop();
	
		
		System.out.println(insert_stack);
		
		insert_stack.pop();
		
		System.out.println(insert_stack);
		
		 test = insert_stack.search("Yogesh");
		System.out.println(test);

		insert_stack.
		
		
		
		


	
		

		
		
	}

}
