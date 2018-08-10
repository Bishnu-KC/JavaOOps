package com.classobject.method;
class Box6 {
	double l,b,h;
	
	// This is a constructors for Box5
	Box6(double x, double y, double z)
	{
		//System.out.println("Constructing Box.");
		l=x;
		b=y;
		h=z;
	}
	
	//compute and return volume
	double volume() {
		return l*b*h;
	}
}

public class ParameterizedConstructor {
	
	public static void main(String args[])
	{
		//declare, allocate, and initialize Box objects
		Box6 mybox1 =new Box6(1,2,3);
		Box6 mybox2 =new Box6(2,3,4);
		double v;
		
		//volume of first box
		v=mybox1.volume();
		System.out.println("The volume of first box is:" +v);
		
		//volume of second box
				v=mybox2.volume();
				System.out.println("The volume of second box is:" +v);
	}
}
