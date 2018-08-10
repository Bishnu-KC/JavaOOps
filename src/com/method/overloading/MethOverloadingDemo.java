package com.method.overloading;
class MethOverloading{
	void test() 
	{
		System.out.println("No parameters.");
	}
	void test(int a)
	{
		System.out.println("a: "+a);
	}
	void test(int a, int b)
	{
		System.out.println("a and b is: "+a+"\n"+b);
	}
	double test(double a)
	{
		System.out.println("Double a is: "+a);
		return a*a;
	}
	
}
 class MethOverloadingDemo {
	public static void main(String args[])
	{
		MethOverloading mo=new MethOverloading();
		double result;
		
		//call all the version of test
		mo.test();
		mo.test(2);
		mo.test(2,3);
		result=mo.test(2.5);
		System.out.println("The final result is: "+result);
		
	}

}
