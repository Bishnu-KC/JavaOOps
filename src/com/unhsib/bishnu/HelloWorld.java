package com.unhsib.bishnu;
import java.util.*;
import javax.swing.*;

public class HelloWorld {
	public static void main (String args[])
	{
		/*
		//This is beginning of Java Programming
		/*
		 * This program this the "Hello World" as an output.
		 * Some discription about the program also.
		 */
		//System.out.println("Hello World.");
		Scanner obj =new Scanner(System.in);
		//System.out.println("Enter any String.");
		//String str= obj.nextLine();
		//System.out.println(str);
		//JOptionPane.showMessageDialog(null, "Hello World");
		
		
		// System.out.println("Hello World!"); // Display the string.
		/*
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("The sum of a and b is: "+c);
		*/
		//int a,b,c;
		System.out.println("ENter the vslue of a:");
		int a=obj.nextInt();
		System.out.println("ENter the vslue of b:");
		
		int b=obj.nextInt();
		int c=a+b;
		System.out.println("The sum of a and b is: "+c);
		
		 
	
		
	}

}
