package oopsJava;

public class Encapsulation_Javaa {
		int a = 78;
		int a2 = 78;
		int a3 = 78;
		int a4 = 78;
		int a5 = 78;
		int a6 = 78;

	//Encapsulation means binding the data together into single group

		
		public static void main(String[] args) {
			Encapsulation_Javaa with_encaps = new Encapsulation_Javaa();
			
			int a1=  with_encaps.getA();
					System.out.println(a1);
					with_encaps.setA(53);
		}


		public int getA() {
			return a;
		}


		public void setA(int a) {
			this.a = a;
			System.out.println(a);
		}
}
