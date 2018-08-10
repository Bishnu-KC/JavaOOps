package com.inheritance.practices;
// Create a super class with private members
class A1 {
	int i;
	private int j; // private to A1 can't access by subclass
	void setij(int x, int y)
	{
		i=x;
		j=y;
	}
}
class B1 extends A1  {
	int k;
	int result;
	void add()
	{
		//result=i+j+k; //ERROR cannot access private member
		result= i+k;
	}
	
}
public class SimpleInheritanceAccessControl {
	public static void main(String args[])
	{
		B1 b=new B1();
		b.k=2;
		b.setij(5,4);
		b.add();
		System.out.println("Total is:" +b.result);
	}

}
