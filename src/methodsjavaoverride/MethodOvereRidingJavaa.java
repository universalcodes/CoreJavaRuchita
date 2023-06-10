package methodsjavaoverride;

public class MethodOvereRidingJavaa {
	
	int b = 67;
	
	public void method_Addition()
	{
		int a = 45;
		int b =56;
		int c = a+b;
		System.out.println(c);
	}
	
	
	public void method_Addition1()
	{
		int a = 45;
		int b =56;
		int c = a+b;
		System.out.println(c);
	}
	

	
	
	
	public static void main(String[] args) {
		
		MethodOvereRidingJavaa2 call_override = new MethodOvereRidingJavaa2();
		call_override.method_Addition();
		System.out.println(call_override.b);
		MethodOvereRidingJavaa call_override1 = new MethodOvereRidingJavaa();
		call_override1.method_Addition();
	}

}

class MethodOvereRidingJavaa2 extends MethodOvereRidingJavaa
{
	public void method_Addition()
	{
		int a = 45;
		int b =56;
		int c = a-b;
		System.out.println(c);
	}
}


