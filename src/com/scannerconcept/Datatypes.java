package com.scannerconcept;

import java.util.Scanner;

public class Datatypes {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("shyam");
		
		byte b = sc.nextByte();
		System.out.println("byte value:"+b);
		 
		short s = sc.nextShort();
		System.out.println("short value:"+s);
		
		int i = sc.nextInt();
		System.out.println(i);
		
		long l = sc.nextLong();
		System.out.println(l);
		
		float f1 = sc.nextFloat();
		System.out.println(f1);
		
		double d = sc.nextDouble();
		System.out.println(d);
		
		char c ='h';
		System.out.println(c);
		
		boolean b1 =sc.nextBoolean();
		System.out.println(b1);
		
		String s1 = sc.nextLine();
		System.out.println(s1);
	}

}
