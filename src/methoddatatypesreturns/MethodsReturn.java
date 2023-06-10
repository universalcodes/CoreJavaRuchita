package methoddatatypesreturns;

public class MethodsReturn {

	public String method_str_type()
	{
		int a = 45;
		int b =56;
		return "String";
	}
	
	
	public int method_int_type()
	{
		MethodsReturn methodrern = new MethodsReturn();
	String printedvalue=methodrern.method_str_type();
	System.out.println(printedvalue);
		int a = 45;
		int b =56;
		return b;
	}
	
	public static void main(String[] args) {
		MethodsReturn methodrern = new MethodsReturn();
			int print_int= methodrern.method_int_type();
			System.out.println(print_int);
	}
}
