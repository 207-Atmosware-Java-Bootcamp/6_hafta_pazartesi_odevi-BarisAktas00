package com.hamitmizrak;

import java.util.Scanner;

public class PrimeNums {
	
	public static void main(String[] args) {
		// Diğer bir ifadeyle, bir mükemmel sayı, bütün pozitif tam bölenlerinin
		// toplamının yarısına eşittir.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a number");
		int number=scan.nextInt();
		int temp=0;
		for(int i=1;i<number;i++) {
			
			if(number%i==0) {
				temp+=i;
				System.out.print(temp+" ");
			}
			
		}
		
		if(temp==number) {
			System.out.println(number+" is a prime number");
		}
		
		
	}
	
}
