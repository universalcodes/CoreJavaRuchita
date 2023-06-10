package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		
		System.out.println(a>b && b>a); // All condition must be true
		System.out.println(a<b || b<a); // At least one should be true
		
		System.out.println(a<b != b<a);  //At least one should be true
		
		short c = 7;
		short d = 6;
		short e = c+d;
		
	}
}
