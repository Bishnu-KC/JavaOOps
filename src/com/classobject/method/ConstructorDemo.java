package com.classobject.method;
class Box5 {
	double l,b,h;
	
	// This is a constructors for Box5
	Box5()
	{
		System.out.println("Constructing Box.");
		l=1;
		b=2;
		h=3;
	}
	
	//compute and return volume
	double volume() {
		return l*b*h;
	}
}

public class ConstructorDemo {
	public static void main(String args[])
	{
		//declare, allocate, and initialize Box objects
		Box5 mybox1 =new Box5();
		Box5 mybox2 =new Box5();
		double v;
		
		//volume of first box
		v=mybox1.volume();
		System.out.println("The volume of first box is:" +v);
		
		//volume of second box
				v=mybox2.volume();
				System.out.println("The volume of second box is:" +v);
	}

}
