package com.classobject.method;
class Box4 {
	double l,b,h;
	
	// compute and return volume
	double volume()
	{
		return l*b*h;
	}
	
	//sets dimensions of box
	void setDim(double x, double y, double z)
	{
		l=x;
		b=y;
		h=z;
	}
}
public class ParameterizedMethod {
	public static void main(String args[])
	{
		Box4 mybox1=new Box4();
		Box4 mybox2=new Box4();
		double v;
		
		//initialize each box
		mybox1.setDim(1, 2, 3);
		mybox2.setDim(2, 3, 4);
		
		//get volume of first box
		v=mybox1.volume();
		System.out.println("The volume of first box is: "+v);
		
		//get volume of second box
				v=mybox2.volume();
				System.out.println("The volume of Second box is: "+v);
	}

}
