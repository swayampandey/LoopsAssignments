package com.bridgelabz.assignment;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int i, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n= sc.nextInt();
		sc.close();
		for(i = 1;i <=10;i++) {
			 
			System.out.println(n*i);
			sum =sum+(n*i);
			
			}
		System.out.println(sum);
	}

}
