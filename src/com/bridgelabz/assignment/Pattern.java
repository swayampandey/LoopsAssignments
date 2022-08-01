package com.bridgelabz.assignment;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// variable declaration
		int i;
		/*
		 * taking user input by using scanner class
		 * and storing the input in variable n
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		sc.close(); // closing the scanner
		int j=n;
		for(i = 1; i <= n; i++) {
			System.out.println(i+"\t"+j);
			j--;
		}
	
	}
	
}
