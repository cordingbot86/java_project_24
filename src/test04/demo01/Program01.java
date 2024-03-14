package test04.demo01;

public class Program01 {

	public static void main(String[] args) {
		//Method Overload
		add(10,20);
		add(1.1,2.2);
		add(1,2,3);
		
		
		
	}
public static void add(int a,int b)
{
	System.out.println(a+b);

}
public static void add(double a,double  b)
{
	System.out.println(a+b);

}
public static void add(int a,int b,int c)
{
	System.out.println(a+b+c);

}


}
