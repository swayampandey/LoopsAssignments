package com.bridgelabz.assignment;
/**
 * 
 * @author dell
 *
 */
public class DivisibilityCheck {
	static int i;
	static int j;
	public static void main(String[] args) {
		System.out.println("Number divisible by 3 :");
		for(i=1; i<=50; i++) {
			if(i%3 == 0 ) 
				System.out.println(i);
		}
		System.out.println("Number divisible by 5 :");
			for(j=1; j<=50; j++) {
			if(j%5 == 0)
				System.out.println(j);
		}
	}
}
