package com.bridgelabz.assignment;
import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Number");
		int a = sc.nextInt();
		System.out.println("Enter the End Number");
		int b = sc.nextInt();
		
		sc.close();
		
		
		for(i=a; i<=b;i++) {
			System.out.println(i);
			
		}

	}

}
