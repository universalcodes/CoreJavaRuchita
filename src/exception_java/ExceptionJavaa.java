package exception_java;

public class ExceptionJavaa {

		public static void main(String[] args)
		{
			
			try {
				
				int fish_count[] = {4,2,5,2,2};
				
				System.out.println(fish_count[5]);
			}
			catch (ArrayIndexOutOfBoundsException exception_covered) 
			{
				System.out.println(  "Array Exception Covered");
				
			}
			
		}
		
		
}
