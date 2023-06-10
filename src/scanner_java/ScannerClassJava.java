package scanner_java;

import java.util.Scanner;

public class ScannerClassJava {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your Name");
		Scanner runtimevalue = new Scanner(System.in);
		String entername = runtimevalue.nextLine();
		System.out.println("The Name as entered as\t"+entername);
		
		int a =  runtimevalue.nextInt();
		int b =  runtimevalue.nextInt();
		int c = a+b;
		System.out.println("The sum of two number as following\t"+c);

		char enter_char = runtimevalue.next().charAt(0);
		System.out.println("The Name as entered as\t"+enter_char);
		
		
		String name = "Yogesh";
		char firstletter = name.charAt(4);
		System.out.println(firstletter);
	}

}
