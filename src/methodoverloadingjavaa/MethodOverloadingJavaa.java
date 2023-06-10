package methodoverloadingjavaa;

public class MethodOverloadingJavaa {
	
	public static void call2()
	{
		System.out.println("This is Ripu");
	}
	
	public static void call2(byte d1)
	{
		System.out.println("This is Blank");
	}
	
	
	public static void call2(int a)
	{
		System.out.println("This is Int");
	}
	
	public static void call2(short a)
	{
		System.out.println("This is short");
	}
	
	
	public static void call2(long a)
	{
		System.out.println("This is Long");
	}
	
	public static void call2(double a)
	{
		System.out.println("This is double");
	}
	
	public static void call2(float a)
	{
		System.out.println("This is Float");
	}
	
	public static void call2(char a)
	{
		System.out.println("This is Char");
	}
	
	public static void call2(boolean a)
	{
		System.out.println("This is Boolean");
	}
	
	public static void call2(String a)
	{
		System.out.println("This is Ripu");
	}
	
	public static void call2(int a, double b)
	{
		System.out.println("int a, short b");
	}
	
	
	public static void call2(int a, double b, long c)
	{
		System.out.println("int a, short b, long c");
	}
	
	public static void call2(int a, double b, long c, float d)
	{
		System.out.println("int a, short b, long c, float d");
	}
	
	
	public static void call2(int a, short b, long c, float d, double e)
	{
		System.out.println("int a, short b, long c, float d, double e");
	}
	
	public static void call2(int a, char b,  float d, double e, boolean f)
	{
		System.out.println("int a, short b, long c, float d, double e, boolean f");
	}
	
	
	public static void call2(int a, short b, long c, float d, double e, boolean f, char g)
	{
		System.out.println("int a, short b, long c, float d, double e, boolean f, char g");
	}
	
	public static void call2(int a, short b, long c, float d, double e, boolean f, char g, boolean h)
	{
		System.out.println("int a, short b, long c, float d, double e, boolean f, char g, boolean h");
	}
	
	public static void call2(int a, short b, long c, float d, double e, boolean f, char g, boolean h, String i)
	{
		System.out.println("int a, short b, long c, float d, double e, boolean f, char g, boolean h, String i");
	}
	
	public static void call2(int a, short b, long c, float d, double e, boolean f, char g, boolean h, String i, String rty)
	{
		System.out.println("int a, short b, long c, float d, double e, boolean f, char g, boolean h, String i, byte j");
	}
	
	
	public static void call2(int a, byte b)
	{
		System.out.println("int a, byte b");
	}
	
	
	public static void main(String[] args)
	{
		
		call2();
		call2(0);
		call2(false);
		call2(0);
		call2(0);
		call2(0);
		call2(0);
		call2(0);
		call2(0, 0);
		
		call2(0, 0);
		call2(0, 0, 0);
		call2(0, 0, 0, 0);
		call2(0, 0, 0, 0, false);
		call2(0, 0, 0, 0, 0);
		call2(0, 0, 0, 0, 0, false, 0);
	}

}
