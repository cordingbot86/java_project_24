package test04.demo01;

public class Program03 extends Program02 {

	public static void main(String[] args) {
		Program03 x=new Program03();
		x.add(15, 25);
		
	}
	@Override
	public void add(int a,int b)
	{
		System.out.println((a*a)+(b*b));
	}

}
