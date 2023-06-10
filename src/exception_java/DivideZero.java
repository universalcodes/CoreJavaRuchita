package exception_java;

import java.io.IOException;
import java.sql.SQLException;

import operators.AirthmaticOperator;

public class DivideZero {

	public static void main(String[] args) {
		try {
			
			int a = 5/0;
			
			System.out.println(a);
		}
		
		catch (Exception exception_covered) 
		{
			System.out.println(  "ArithmeticException Exception Covered by Ruhita");
			
		}
		catch (RuntimeException cls_exception) 
		{
			System.out.println(  "ArithmeticExceptioon is  Exception Covered by me ");
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
}
