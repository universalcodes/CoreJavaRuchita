package oopsJava;

public class MethodOverloading {

	public void shape()
	{
		System.out.println("Shape is Blank");
	}
	
	public void shape(String shapename)
	{
		
		System.out.println("Shape is "+ shapename);
		
	}
	
	public void shape(String shapename, boolean shape_check)
	{
		
		System.out.println("Shape is "+ shapename +"\t" + shape_check);
		
	}
	public static void main(String[] args) {
		
		MethodOverloading over_load = new MethodOverloading();
		over_load.shape();
		over_load.shape("Triangle");
		over_load.shape("Triangle", true);

		MethodOverriding call_ovride = new MethodOverriding();
		call_ovride.shape();
	}
	
}

class MethodOverriding extends MethodOverloading
{
	public void shape()
	{
		System.out.println("Shape is Blank");
	}
}

