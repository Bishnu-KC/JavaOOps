package com.unhsib.bishnu;

public class SuperKeyDemo extends SuperClass {
	int someNum=25;
	void printNumber()
	{
		System.out.println(super.someNum);
	}
	void display()
	{
		System.out.println("From sub class");
	}
	
	void printMessage()
	{
		display();
		super.display();
	}
	public static void main(String args[])
	{
		SuperKeyDemo sb= new SuperKeyDemo();
				sb.printNumber();
				sb.printMessage();
	}

}
class SuperClass
{
	int someNum=20;
	void display()
	{
		System.out.println("From super class");
	}
}