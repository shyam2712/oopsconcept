package com.programs;

public class Maaax {
public static void main(String[]args) {
	int oddcount= 0;
	int evencount= 0;
	for (int i=1;i<=175;i++) {
		if (i%2==0){
			evencount = evencount+1;
			
		}
		else {
			oddcount = oddcount+1;
		
		}
	}
		System.out.println("the evencount is:"+evencount);
		System.out.println("the oddcount is :"+oddcount);
	
	}	
}
