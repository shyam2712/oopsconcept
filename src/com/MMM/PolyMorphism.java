package com.MMM;

public class PolyMorphism  {
	public void bike (int rate ) {
		System.out.println("tvs: "+rate);}
	
	public void bike (String duke  ) {
		System.out.println("150cc:"+duke);}
	
	public void bike (int rate, String duke) {
		System.out.println("tvs:"+rate);
	    System.out.println("150cc:"+duke);}
	  
	public void main (String[]args) {
	 PolyMorphism pod = new PolyMorphism();
	 pod.bike(155000);
	 pod.bike("pakka");
	 
	}

	
}
