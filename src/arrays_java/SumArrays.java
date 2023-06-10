package arrays_java;

public class SumArrays {

	public static void main(String[] args) {
		
		int a []= {4,75,32,1};
		 int finalsum=0;
		 
		for (int result : a) 
		{
			finalsum = finalsum+result;// technique 1
			finalsum+=result; // technique 2

		}
		System.out.println(finalsum);

		 
	}

	
}
