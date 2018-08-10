package com.javasession.AbstractClass;

 abstract class Animal {
	public abstract void sound();

}
public class Cat extends Animal {
	public void sound()
	{
		System.out.println("Cat sound");
	}
	
	public static void main (String args[])
	{
		Cat a = new Cat();
		a.sound();
	}
}
