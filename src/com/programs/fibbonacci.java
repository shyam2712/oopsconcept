package com.programs;

public class fibbonacci {

	public static void main(String[] args) {
		
		int a=2,b=4,c=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 0;i<=5;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
			
	}	
}
