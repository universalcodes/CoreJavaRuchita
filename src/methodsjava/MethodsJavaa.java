package methodsjava;

public class MethodsJavaa {
	
	public void method_Addition()
	{
		int a = 45;
		int b =56;
		int c = a+b;
		System.out.println(c);
	}
	public  void method_Subtract()
	{
		int a = 45;
		int b =56;
		int c = a-b;
		System.out.println(c);
		method_Multi();
	}
	public void method_Multi()
	{
		int a = 45;
		int b =56;
		int c = a*b;
		System.out.println(c);
		
	}	
	public   void  method_Devide()
	{
		int a = 45;
		int b =56;
		int c = a/b;
		System.out.println(c);
	
		
	}
	
	public static void main(String[] args)
	{
		
		
		
		MethodsJavaa method_muti= new MethodsJavaa();  // default cons
		method_muti.method_Multi();  //1

	}

}
