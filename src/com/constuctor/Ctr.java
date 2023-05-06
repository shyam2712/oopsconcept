package com.constuctor;



public class Ctr  {
	 public Ctr () {
		 this (55);
		 System.out.println("Default Constructor");
		 
	 }
      public Ctr (int id) {
    	  this (1556.24f);
    	  System.out.println("integer contuctor");
		 
	 }
      public Ctr (float id) {
    	  this("shyam");
    	  System.out.println("float constructor");
	 
 }
      public Ctr (String id) {
    	  this (true);
    	  System.out.println("string constructor");
	 
 }
      public Ctr (Boolean id) {
    	  
    	  System.out.println("boolean constructor");
 		 
 	 }
      public static void main(String[] args) {
    	Ctr a = new Ctr();
        
		
	}
}
