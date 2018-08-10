package com.java.io.example;

import java.io.File;
import java.io.IOException;

public class ReadOnly {
	public static void main(String[] args) throws IOException
    {	
    	File myfile = new File("/Users/bishnu/eclipse-workspace/SelfLearning/src/com/java/io/example/Myfile.txt");
    	//making the file read only
    	boolean flag = myfile.setReadOnly();	
    	if (flag==true)
    	{
    	   System.out.println("File successfully converted to Read only mode!!");
    	}
    	else
    	{
    	   System.out.println("Unsuccessful Operation!!");
    	}
    }

}
