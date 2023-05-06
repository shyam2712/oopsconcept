package com.testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Split {
	public static void main(String[] args) throws IOException {
	File f = new File("E:\\aji\\Camera");
	 
    String [] listfiles= f.list();
    for(String x:listfiles) {
    	System.out.println(x);
    }
	
	
	
	
	
	
	
	}}