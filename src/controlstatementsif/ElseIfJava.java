package controlstatementsif;

public class ElseIfJava {
	
	public static void main(String[] args) {
		
		String name = "Yogesh";
		
		
		
		if(name=="Yogeshh")
		{
			System.out.println("Correct\t"+name);
		}
		
		else if (name=="Yogesh") // if this is condition is false although it will go further
		{
			
			System.out.println("Not Correct\t"+name);
			if (name=="Yogeshg")
			{
				System.out.println("Not Correct\t"+name);
				
				if (name=="Yogesh")
				{
					System.out.println("Not Correct\t"+name);
				}
			}
			

			
			
					
		}
			
		}
	
		
		
	}


