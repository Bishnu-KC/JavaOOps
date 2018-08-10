package com.method.overloading;
class Test
{
	int a, b;
	Test(int i, int j)
	{
		a=i;
		b=j;
	}
	//return true if x is equal to the invoking object
	boolean equals(Test x)
	{
		if(x.a==a &&x.b==b)
			return true;
		else 
			return false;
	}
}
public class ObjectParameter {
	public static void main(String args[])
	{
		Test obj=new Test(10,20);
		Test obj1=new Test(10,20);
		Test obj2=new Test(1,2);
		System.out.println("obj == obj1: " + obj.equals(obj1));
		System.out.println("obj == obj2: " + obj.equals(obj2));
		
		
	}

}
