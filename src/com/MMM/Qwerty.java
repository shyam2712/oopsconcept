package com.MMM;

public class Qwerty  {
	public void kvcet (int i) {
		System.out.println("STUDENT ROLL NO: "+i);}
	
	public void kvcet(String name ) {
		System.out.println("student:"+name);}
	
	public void kvcet (int rollNo, String name) {
		System.out.println("STUDENT ROLL NO:"+rollNo);
	    System.out.println("Student Name:"+name);}
	 public void tcl(String ktv) {
		 System.out.println("1080p:=ktv");
	 }
	public static void main (String[]args) {
	   Qwerty L = new Qwerty();
	   L.kvcet("sathish");
	   L.kvcet("siva");
	   L.kvcet(10);
	   L.kvcet(27,"yffyt");
	   
	   
		
	}

}
