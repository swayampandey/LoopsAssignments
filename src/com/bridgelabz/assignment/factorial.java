package com.bridgelabz.assignment;
import java.util.Scanner;
public class factorial {
	/*
	 * java program to calculate factorial of input number
	 */

	public static void main(String[] args) {
		// variables declaration
		int i, fact =1;
		/*
		 *  taking user input by using scanner class
		 *  and storing the user input in variable num
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		sc.close(); // closing the scanner
		for(i=1;i<=num;i++) {
			fact=fact*i;
			 }
		System.out.println("Factorial of " +num+ " is "+fact);

	}

}
