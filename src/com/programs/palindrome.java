package com.programs;

public class palindrome {
	public static void main(String[] args) {
		int count =0;
	for (int n =1;n<1000;n++) {
		int i=0,j=0,a=0;
		a=n;
		while(a>0) {
			i=a%10;   
			j=(i*i*i)+j;
			a=a/10;
		}
		if (n==j) {
			System.out.println(n);
			count++;
		}
	}
	System.out.println(count);
	}

}
