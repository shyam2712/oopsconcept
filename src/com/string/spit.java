package com.string;

public class spit {
	public static void main(String[] args) {
		
		String s = "welcome to java program";
	String reverse = "";
		String reverse1 = "";
		String[]split = s.split("   ");
		
		
		
		for (int i = split[1].length()-1; i>=0; i--) {
			reverse = reverse+split[1].charAt(i);
		}
		
		for(int i =split[3].length()-1;i>=0;i--){
			reverse1 = reverse1+split[3].charAt(i);
		}
	System.out.println(split[0]+""+reverse+""+split[3]+""+reverse1+"");
	
	}
	

}
