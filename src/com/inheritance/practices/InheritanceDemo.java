package com.inheritance.practices;

// Base class or parent class or super class
class Bicycle {
	int gear;
	int speed;
	
	//Defining the constructor
	Bicycle(int gear, int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	
	//Defining the three methods for Bicycle
	void applyBrake(int decrement)
	{
		speed -=decrement;
	}
	void speedUp(int increment)
	{
		speed +=increment;
	}
	public String toString()
	{
		return("No of gears are: "+ gear+"\n"+"speed of bicycle is "+ speed);
	}
}

// derived class / sub class / child class
class MountainBike extends Bicycle {
	int seatHeight;
	MountainBike(int gear, int speed, int startHeight)
	{
		super(gear, speed);
		seatHeight=startHeight;
	}
	public String toString()
	{
		return(super.toString()+ "\nseat height is "+ seatHeight);
	}
	
}


public class InheritanceDemo {
	public static void main(String args[])
	{
		MountainBike mb= new MountainBike(3,100,25);
		System.out.println(mb.toString());
	}

}
