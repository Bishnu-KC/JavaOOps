package com.classobject.method;
/*
 *  A program that uses the Box class.
 *  Call this file BoxDemo.java
 */
class Box
{
	double width;
	double height;
	double depth;
}
// This class declares an object of type Box.
public class BoxDemo {
	public static void main(String args[])
	{
		Box mybox=new Box(); //Create an object mybox of class Box.
		double volume;
		
		//Assign values to mybox's instance variables
		mybox.width=10;
		mybox.height=20;
		mybox.depth=15;
		
		//Calculate the volumes of box.
		volume=mybox.width*mybox.height*mybox.depth;
		
		//Displaying the results.
		System.out.println("The volume of Box is: "+volume);
	}
	

}
