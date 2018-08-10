package com.java.io.example;

import java.io.File;
import java.io.IOException;

public class HiddenFile {
	public static void main(String[] args) throws IOException, SecurityException
    {	
    	// Provide the complete file path here
    	File file = new File("/Users/bishnu/eclipse-workspace/SelfLearning/src/com/java/io/example/myfile1");
 
    	if(file.isHidden()){
    		System.out.println("The specified file is hidden");
    	}else{
    		System.out.println("The specified file is not hidden");
    	}
    }

}
