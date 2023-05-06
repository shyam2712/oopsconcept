package com.encapsulation;

import java.util.*;

public class Userlist extends Private {
	public static void main(String[] args) {
		
	
 Set <Private> l1 = new HashSet <>();
 Private b1  = new Private ();
 b1.setRollno(54);
 b1.setName("sathish");
 b1.setPhno(5645656);
 
 Private n1 = new Private ();
 n1.setName("shyam");
 n1.setRollno(55);
 n1.setPhno(798646848);
 l1.add(b1);
 l1.add(n1);
 
 //for(Private x:l1) {
//	 System.out.println(x.getRollno());
//	 System.out.println(x.getName());
//	 System.out.println(x.getPhno());
//	 
 }}
 

