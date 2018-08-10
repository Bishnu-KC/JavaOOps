package com.method.overloading;
class Box{
	double l,b,h;
	// this is a constructor for Box.
	Box(double x, double y, double z )
	{
		l=x;
		b=y;
		h=z;
		
	}
	Box()
	{
		l=1;
		b=2;
		h=3;
	}
	Box(double len)
	{
		l=b=h=len;
	}
	// compute and return volume
	double volume()
	{
		return l*b*h;
	}
}

public class ConstructorOverloading {
	public static void main(String args[])
	{
		Box mybox=new Box(1,2,3);
		Box mybox1=new Box();
		Box mybox2=new Box(10);
		double vol;
		vol=mybox.volume();
		System.out.println("The volume of first box is: "+vol);
		vol=mybox1.volume();
		System.out.println("The volume of second box is: "+vol);
		vol=mybox2.volume();
		System.out.println("The volume of third box is: "+vol);
	}

}
