package day03.test02;

import day03.test01.Program01;

public class Program02 extends Program01{
	public static void main(String[] args) {
		addMethod(18,10);
		//subMethod(30,20);
		 mulMethod(3,2);
		//sqraMethod(55,30);
		Program02 x=new Program02();
		x.addMethodNonStatic(100, 40);
		//x.subMethodNonStatic(30, 10);
		x.mulMethodNonStatic(45, 20);
		x.addMethodNonStatic(10, 5);	
		Program01 y=new Program01();
		y.addMethodNonStatic(100,40);
		//y.mulMethodNonStatic(45, 20);
		
	}
}
