package test06;

public class Program05 {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=20;
		
		if((a>b)&&(a>c))
		{
			System.out.println("a is greater");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is greater");
		}
		else  if((c>a)&&(c>b))
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("a & b & c is equal");
		}

	}

}
