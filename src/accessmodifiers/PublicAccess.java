package accessmodifiers;

public class PublicAccess {
	
		 static String name = "Ruchita";
				
	
	public static void main(String[] args) {
		
		PrivateAccess access_private = new PrivateAccess();
		System.out.println(access_private.name);
	}

}

class PublicAccess2 extends PublicAccess
{
	
}
