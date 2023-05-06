
package com.programs;

public class Reverse {
	public static void main(String[] args) {
		int n=88,i=0,j=0,a;
		a=n;
		while(a>0) {
			i = a%10; 
			j=(i*i*i)+i; 
			a=a/10; 
			
		}
	if (n==j) {
		System.out.println(" armstrong number ");}
	else {
		System.out.println("not a armstrong");
	}
	}
}


