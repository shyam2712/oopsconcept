package com.programs;

import java.util.*;

public class Concurrencewithwords {

	public static void main(String[] args) {
		String s = "welcome to java program or java programe welcomes u";
		Map <String,Integer> mp = new HashMap<>();
		String[] cs = s.split(" ");
		for(String c:cs) {
			if(mp.containsKey(c)) {
				Integer x = mp.get(c);
				mp.put(c,x+1);}
				
				else
				{
					mp.put(c, 1);
				}}
			System.out.println(mp);
			
		
		
	}
}
