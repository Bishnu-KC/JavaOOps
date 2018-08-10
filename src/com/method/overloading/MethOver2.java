package com.method.overloading;
class MethodOverloadding{
	void test()
	{
		System.out.println("No parameters.");
	}
	void test(int a, int b)
	{
		System.out.println("The value of a and b are: "+a + b);
	}
	void test(double a)
	{
		System.out.println("The double value is: "+a);
	}
	
}
public class MethOver2 {
	public static void main (String args[])
	{
		MethodOverloadding mo= new MethodOverloadding();
		int i=9;
		mo.test();
		mo.test(10,20);
		mo.test(i);
		mo.test(2.5);
		
	}

}
