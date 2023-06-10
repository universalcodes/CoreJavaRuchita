package oopsJava;

public interface InterfaceeCode {

	int a = 45;
	int b = 78;

	
	
	
	public static void main(String[] args) {
		InterfaceeCode intertest = new InterfaceeCode3();
			System.out.println(intertest.a);
			System.out.println(intertest.b);
	}
	
	
}


	




class InterfaceeCode2 implements  InterfaceeCode, Testing
{
	
	
}

class InterfaceeCode3 extends InterfaceeCode2
{
	

}

