package com.javasession.AbstractClass;

public class DemoInterface implements MyInterface, SoundInterface{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("This is method one");
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("This is methow two");
		
	}
	public static void main(String args[])
	{
		MyInterface obj= new DemoInterface();
		obj.meth1();
		obj.meth2();
		SoundInterface obj1= new DemoInterface();
		obj1.meth3();
	}

	@Override
	public void meth3() {
		// TODO Auto-generated method stub
		System.out.println("This is methow three");
		
	}
	

}

interface MyInterface {
	public void meth1();
	public void meth2();
}
interface SoundInterface {
	public void meth3();
}