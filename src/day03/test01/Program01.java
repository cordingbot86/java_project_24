package day03.test01;

public class Program01 {
	public static void main(String[] args) {
		addMethod(18,10);
		subMethod(30,20);
		 mulMethod(3,2);
		sqraMethod(55,30);
		Program01 x=new Program01();
		x.addMethodNonStatic(100, 40);
		x.subMethodNonStatic(30, 10);
		x.mulMethodNonStatic(45, 20);
		x.addMethodNonStatic(10, 5);	
	}
	public static void addMethod(int a,int b)
	{
		System.out.println(a+b);
	}
	private static void subMethod(int a,int b)
	{
		System.out.println(a-b);
	}
	protected static void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}
	static void sqraMethod(int a,int b)
	{
		System.out.println(a*a);
	}
	public void addMethodNonStatic(int a,int b)
	{
		System.out.println(a+b);
	}
	private  void subMethodNonStatic(int a,int b)
	{
	System.out.println(a-b);
	}
	protected void mulMethodNonStatic(int a,int b)
	{
		System.out.println(a*b);
	}
	 void sqraMethodNonStatic(int a,int b)
	{
		System.out.println(a*a);
	}
	

}
