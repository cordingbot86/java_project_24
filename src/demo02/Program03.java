package demo02;

public class Program03 {
	public static void main(String[] args) {
		Program03 xyz=new Program03(); 	
		xyz.addMethod(20,30);
		xyz.subMethod(40,20);
		xyz.mulMethod(10,20);
	}

	
	public void addMethod(int a, int b)
	{
		System.out.println(a+b);
	}
	public void subMethod(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mulMethod(int a, int b)
	{
		System.out.println(a*b);
	}
	
}
