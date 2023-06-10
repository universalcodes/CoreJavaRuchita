package operators;

public class PreInCrememt {
		public static void main(String[] args) {
			int a = 7;
			
			++a;  //8
			a++;  //8
			System.out.println(a);  //9
			
			int b = 6;
			int c = b + b + ++b - b++ + b;     // 6 +6 + 7=19
			// 6+6 + 7 -7 +8
			System.out.println(c);
			
			int d = 56;
			int e = ++d + d + ++d +d;  // 57 + 57 +58 +58
			System.out.println(e);
			
			int f = 567;
			int g = f + f++ + f + f++;   // 567 + 567 + 568 + 568
			System.out.println(g);
		}
}
