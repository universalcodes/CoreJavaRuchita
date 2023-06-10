package controlstatementsif;

public class NestedifCondition {
	
	public static void main(String[] args) {
		
		String name = "Ruchita";

		if(name == "Ruchita") // based on the condition your statement will be performed
		{
			System.out.println("Condition is true\t"+name);
			
			
			if(name == "Ruchita")
			{
				System.out.println("Condition is true\t"+name);
			}
			else {
				System.out.println("Condition is False");
			}
			
			
			if(name == "Ruchitaa")
			{
				System.out.println("Condition is true\t"+name);
			}
			
			else {
				System.out.println("Condition is False");

				
			}
			
			
			if(name == "Ruchitaa")
			{
				System.out.println("Condition is true\t"+name);
			}
			
			else {
				
				System.out.println("Condition is False");	
			}
	
		}
		
		
		else {
			
			System.out.println("it will print or not");
			
		}
		
			

		
		
		
	}

}
