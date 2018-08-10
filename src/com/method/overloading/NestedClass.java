package com.method.overloading;
//Demonstrate an inner class.
class Outer {
  int outer_x = 100;
  void test()
  {
    Inner inner = new Inner();
    inner.display();
  }
  class Inner {
	    void display() 
	    {
	      System.out.println("display: outer_x = " + outer_x);
	    }
	} }
  // this is an inner class
public class NestedClass {
	public static void main(String args[]) {
	    Outer outer = new Outer();
	    outer.test();
	  }

}
