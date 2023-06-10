package accessmodifiers;

public class PrivateAccess {
	
	private  String name = "Ruchita";
			

public static void main(String[] args) {
	
	PublicAccesTest access_private = new PublicAccesTest();
	System.out.println(access_private.name);
}

}

class PublicAccesTest extends PrivateAccess
{

}
