package com.programs;

import java.util.*;

public class Concurencewithletter {
	public static void main(String[] args) {
		
	
	  String s = "welcome to java programe";
	Map<Character,Integer>mp = new HashMap<>();
	char[] cs = s.toCharArray();{
	for(char c:cs) {
		
		if(mp.containsKey(c)) {
			Integer x = mp.get(c);
			mp.put((char) 1, x+1);}
	
		else {
			mp.put(c, 1);}
		}
	System.out.println(mp);

	}
	}}
	
