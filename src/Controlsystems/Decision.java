package Controlsystems;

import java.util.Scanner;

public class Decision {
	public static void main (String[]args) {
	      Scanner bv = new Scanner(System.in);
	      System.out.println("enter the amount ");
	
	     int amount = bv.nextInt();
	     
	     if (amount<10000) {
	    	 System.out.println("720ptcl:"+amount);
	     }
	     else if (amount>=10000 && amount<=20000) {
	    	 System.out.println("1080poneplus:"+amount);
	     }
	     else if (amount>20000 &&  amount<=30000)	{
	    	 System.out.println("4k mi:"+amount);
	     }
	     else {
	    	 System.out.println("brand not availabe");
	     }
	
	
	}
	

}
