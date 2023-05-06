package com.string;

public class reverse {
	public static void main(String[] args) {
		
		String s ="rcb is mokka team";
		String reverse ="";
		String reverse1 = "";
		String[] split =s.split (" ");
		
		for (int i = split[1].length()-1;i>=0;i--){
		reverse = reverse+split[1].charAt(i);}
		
		for (int i = split[3].length()-1;i>=0;i--){
			reverse1 = reverse1+split[3].charAt(i);
		}
		System.out.println(split[0]+" "+reverse+" "+split[2]+" "+reverse1+" ");}}
	
