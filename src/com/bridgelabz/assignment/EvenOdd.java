package com.bridgelabz.assignment;


public class EvenOdd {
	static int i;
	static int j;
	static int EvenSum;
	static int OddSum;
	public static void main(String[] args) {
		int i,EvenSum=0,OddSum=0;
		for(i=1;i<=20;i++) {
		
			if(i%2!=0 ) {
				System.out.print(i);
				OddSum=OddSum+i;
			}
			else {
				System.out.println("\t"+i);
				EvenSum=EvenSum+i;
			}
		}
		System.out.println("--------------");
		System.out.println("Total\tTotal");
		System.out.println(OddSum+"\t"+EvenSum);
			
				
		
			
		
		
	}

}
