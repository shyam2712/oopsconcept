package com.MMM;

public class Pollyconcept extends Qwerty {
	public void josephs (int i ) {
		System.out.println("student roll no:"+i);
	}
	public void josephs(String name) {
		System.out.println("student :"+ name);
	
	}
	public void josephs (int rollno , String name) {
		System.out.println("rollno:"+rollno);
		System.out.println("student name:" +name);
		
	}
	public void kvcet(String name ) {
		System.out.println("student:"+name);}

	public static void main(String[]args){
		
		Pollyconcept aa = new Pollyconcept();
		aa.josephs("shanmugam");
		aa.josephs(5587);
        
        aa.kvcet("shyam thala");
        
        
        String[] cars = {"volvo","bmw","qwerty"};
        System.out.println(cars[1]);
        
	
	}
	
}
