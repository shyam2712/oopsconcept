package com.testing;

import java.util.*;
import java.util.Map.Entry;

public class reverse {
	public static void main(String[]args) {
     Map <String,Integer>tv = new HashMap<>();
     tv.put("tcl", 12000);
     tv.put("lg", 15500);
     tv.put("samsung", 20000);
     tv.put("mi", 20000);
     
     System.out.println(tv);
     
    
     Set<String> keyset= tv.keySet();
     System.out.println(keyset);
     
     Collection<Integer> values = tv.values();
     System.out.println(values);
     
     Set <Entry<String,Integer>>entryset = tv.entrySet();
    
     for (Entry<String,Integer>entry:entryset) {
    	 System.out.println(entry);
     }
     
     
	
	}}