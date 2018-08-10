package com.method.overloading;
class Boxes{
	double l, b, h;
	
	//Notice this constructor. It takes an object of type Box.
	Boxes(Boxes ob)
	{
		// Pass object to constructor
		l=ob.l;
		b=ob.b;
		h=ob.h;
		
	}
	
	// constructor used when all dimensions specified
	Boxes(double x, double y, double z)
	{
		l=x;
		b=y;
		h=z;
	}
	
	//constructor used when no dimensions specified
	Boxes()
	{
		l=2;
		b=3;
		h=4;
	}
	
	//constructor used when cube is created
	Boxes(double len)
	{
		l=b=h=len;
	}
	
	//compute and return volume
	double volume()
	{
		return l*b*h;
	}
}

public class ConstructorParaAsObject {
	public static void main (String args[])
	{
		// create boxes using the various constructors
        Boxes mybox1 = new Boxes(10, 20, 15);
        Boxes mybox2 = new Boxes();
        Boxes mycube = new Boxes(7);
        Boxes myclone = new Boxes(mybox1); // create copy of mybox1
        double vol;
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of cube is " + vol);
        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
	}

}
