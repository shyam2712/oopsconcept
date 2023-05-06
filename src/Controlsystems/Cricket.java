package Controlsystems;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner er = new Scanner (System.in);
		System.out.println("target is 300");
		System.out.println("req runrate will be");
		int runrate =er.nextInt();
		 
		if (runrate<6) {
			System.out.println("current run rate:"+runrate);}
		else if (runrate<=10  && runrate>=12){
			System.out.println("curent run rate:"+runrate);}
		else {
			System.out.println("cannot be chased");
		}
		
		}
	
	}


		
	