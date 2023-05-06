package com.MMM;

public class Television   {
	public void tcl (int sun ) {
		System.out.println("pixel: "+sun);}
	
	public void tcl (String ktv  ) {
		System.out.println("1080p:"+ktv);}
	
	public void tcl (int sun, String ktv) {
		System.out.println("pixel:"+sun);
	    System.out.println("1080p:"+ktv);}
	  
	public static void main (String[]args) {
		Television bg = new Television();
		bg.tcl("crystal clear");
		bg.tcl(10);
		bg.tcl(10,"crystal clear");
	
	}

}
