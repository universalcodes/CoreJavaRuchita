package oopsJava;

import accessmodifiers.PrivateAccess;
import accessmodifiers.ProtectedAcess;
import accessmodifiers.ProtectedAcess1;
import accessmodifiers.PublicAccess;

public class FirstName_Inheritance {

	String name ="Ruchita";
	
	public static void main(String[] args) {
		
		LastMotherName_Inheritance inheri_var = new LastMotherName_Inheritance();
		System.out.println(inheri_var.name);
		System.out.println(inheri_var.motherlstname);
		System.out.println(inheri_var.lstname);
		
		System.out.println(PublicAccess.name);
		
		ProtectedAcess proaccess = new ProtectedAcess();
		System.out.println(proaccess.getName());
		
	
		
	}
}

class PresentName_Inheritance extends FirstName_Inheritance
{
	String lstname = "Chittora";


}

 class LastMotherName_Inheritance extends PresentName_Inheritance
{
	String motherlstname = "Dinopia";

}

 class PresentName_In extends FirstName_Inheritance
 {
 	String lstname = "Chittora";

 }
