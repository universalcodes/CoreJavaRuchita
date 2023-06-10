package arrays_java;

public class ArraysJava1 {

public static void main(String[] args) 
{
	int a[]= {5,6,2, 1};  // technique 1  0 to3
	int[] b = {2,6,3,2}; // technique 2
	int c[] = new int[4];// technique 3
	c[0]= 6;
	c[1]=3;
	c[3]=4;
	System.out.println(a[4]);  // ArrayIndexOutOfBoundsException
	System.out.println(c[3]);
	System.out.println(c[2]);

	
	
	
	
}
}
