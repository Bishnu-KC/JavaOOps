package com.inheritance.practices;
// Create a super class
class A {
	int i, j;
	void showij()
	{
		System.out.println(" i and j :"+ i+" "+j);
	}
}
// Create a subclass by extending class A.
class B extends A {
	int k;
	void showk()
	{
		System.out.println("k : "+k);
	}
	void sum()
	{
		System.out.println("the sum of i, j, and k is: "+(i+j+k));
	}
	
}
public class SimpleInheritanceDemo {
	public static void main (String args[])
	{
		A a=new A();
		B b=new B();
		
		//The super class may be used by itself
		a.i=5;
		a.j=10;
		System.out.println("The contents of super class is:");
		a.showij();
		
		//The sub class has access to all members of its super class
		b.i=1;
		b.j=2;
		b.k=3;
		System.out.println("The contents of sub class is:");
		b.showij();
		b.showk();
		b.sum();
		
	}

}
