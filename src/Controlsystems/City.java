package Controlsystems;

import java.util.Scanner;

public class City {
	public static void main(String[] args) {
		Scanner asd = new Scanner (System.in);
			System.out.println("population");
			 
			int city = asd.nextInt();
			
			if (city<1000) {
				System.out.println("delhi:"+city);
			
		}
			else if (city<=1000 && city>=2000) {
				System.out.println("chennai:"+city);
			}
			else {
				System.out.println("doesn't match this city");
			}
	}

}
