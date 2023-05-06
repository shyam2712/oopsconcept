  package Controlsystems;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in)	;
	 System.out.println ("enter the grade");
		 
		int mark = sc .nextInt ();
				 
		 if (mark<40) {
			 System.out.println("f grade:"+mark);
		 }
		 else if (mark>=40 && mark<=60) {
			 System.out.println("c grade:"+mark);
		 }
		 else if (mark>=60 && mark<=80 ) {
			 System.out.println("b grade:"+mark);
		 }
		 
		 
		 
		
		
	}

}
