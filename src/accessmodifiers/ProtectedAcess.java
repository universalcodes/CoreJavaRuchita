package accessmodifiers;

public class ProtectedAcess {
	private  String name = "Ruchita";

	public static void main(String[] args) {
		ProtectedAcess1 proaccess = new ProtectedAcess1();
		System.out.println(proaccess.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class  ProtectedAcess1 extends ProtectedAcess
{
	
}