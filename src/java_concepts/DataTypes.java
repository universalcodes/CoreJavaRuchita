package java_concepts;

public class DataTypes {
	
		String firstname = "Ruchita";  // Instance Variable // Depandant Variable // Non Static  means we need object to access the non static  variables
		static String lastname = "Kumari"; 
	// static we dont need any objects we can access directly
	
	public static void main(String[] args) {
		
		String name1; //only Declartion
		String name = "Ruchita";    //Declartion + Inilitization 
		char name_letter ='R';  // R is a Value or Literals
		boolean gender = true;
		byte number = 5;  
		System.out.println(number);
		 number = 7;  // reassgining value
		 number = 2;
		 number = 1;
		 number = 0;
		 System.out.println(number);
		 
		 char a = 56;
		 int a1 ='A';
		 System.out.println("updated char print\t"+a);
		 System.out.println("updated int print\t"+a1);

		 
		
		short favorite_number = 3456;
		int age = 123456;
		long mobilenumber = 9986778788l;
		float height = 14.1234561;
		double doubleheight = 3445.2d;
		
		System.out.println(name  + "\n" + name_letter + "\n" + height + "\n" +favorite_number + "\n" + gender + "\n" + mobilenumber + "\n" + doubleheight + "\n" + number + "\n" + age);
		
		
		System.out.println(lastname);
		
		DataTypes call_nons_var = new DataTypes();  // default
		String prnt_first = call_nons_var.firstname;  // technique 1 printing through storing into variable
		
		lastname = "Chittora";
		System.out.println(lastname);
		
		lastname= "Kamra";
		System.out.println(lastname);
	
		
		System.out.println(prnt_first);
		System.out.println(call_nons_var.firstname);  //technique 2 printly directly in sysout
		call_nons_var.firstname = "Ruchitaaa";
		System.out.println(call_nons_var.firstname);
	
	}
	
	

}
