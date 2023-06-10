package oopsJava;

public final class  FinalKeywordJavaa {
	  final  int a = 89;
	 
	 public final static void test_Met()
	 {
		 System.out.println("Testing");
	 }

	public static void main(String[] args) {
		
		FinalKeywordJavaa test = new FinalKeywordJavaa();
		System.out.println(test.a);
		test.a = 90;
		
		
	}
}

class FinalKeywordJavaa1 extends FinalKeywordJavaa{

	
	
}
