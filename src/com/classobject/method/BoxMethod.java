package com.classobject.method;
class Box2{
	double l;
	double b;
	double h;
	
	// display volume of a box
	
	void volume()
	{
		double v;
		v=l*b*h;
		System.out.println("The volume of Box2 is: "+v);
	}
}
public class BoxMethod {
	public static void main(String args[])
	{
		Box2 mybox1=new Box2();
		Box2 mybox2=new Box2();
		
		//assign values to mybox1's instance variables
		mybox1.l=10;
		mybox1.b=20;
		mybox1.h=30;
		
		//assign values to mybox2's instance variables
		mybox2.l=5;
		mybox2.b=10;
		mybox2.h=15;
		
		//display volume of first box
		mybox1.volume();
		
		// display volume of second box
		mybox2.volume();
		
	}

}
