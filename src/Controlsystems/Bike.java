package Controlsystems;

import java.util.Scanner;

public class Bike {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int Bike =sc.nextInt() ;
		
		if (Bike<115) {
			System.out.println("dio:"+Bike);
		}
		else if (Bike>=115 && Bike<=130) {
			System.out.println("shine:"+Bike);
		}
		else if (Bike<=130 && Bike>=220) {
			System.out.println("apache:"+Bike);
		}
		else {
			System.out.println("does not match any bike ");
		}
		
		
	}

}
