package test05;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter int value of a:-");
		int a=x.nextInt();
		System.out.println("Enter int value of b:-");
		int b=x.nextInt();
		System.out.println("Enter double value of c:-");
		double c=x.nextDouble();
		x.close();
		
		System.out.println(a+b);
		System.out.println(a+c);
		
		System.out.println(a-b);
		System.out.println(a-c);
		
		
		System.out.println(a*b);
		System.out.println(a*c);
		
		System.out.println(a/b);
		System.out.println(a/c);
		
	}
	
}
