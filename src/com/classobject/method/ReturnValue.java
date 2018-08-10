package com.classobject.method;
class Box3{
	double l;
	double b;
	double h;
	
	// compute and return volume of a box
	
	double volume()
	{
		return l*b*h;
		
	}
}
public class ReturnValue {
	public static void main(String args[])
	{
		Box3 mybox1=new Box3();
		Box3 mybox2=new Box3();
		double v;
		
		//assign values to mybox1's instance variables
		mybox1.l=10;
		mybox1.b=20;
		mybox1.h=30;
		
		//assign values to mybox2's instance variables
		mybox2.l=5;
		mybox2.b=10;
		mybox2.h=15;
		
		//display volume of first box
		v=mybox1.volume();
		System.out.println("The volume of first box is: "+v);
		
		// display volume of second box
		v=mybox2.volume();
		System.out.println("The volume of second box is: "+v);
	}

}
