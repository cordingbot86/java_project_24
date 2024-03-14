package test06;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int a=x.nextInt();
		x.close();
		
		if(a%2==0)
		{
			System.out.println("a is even.......");
		}
		else
		{
			System.out.println("b is odd.........");
		}

	}

}
