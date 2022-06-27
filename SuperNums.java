package com.hamitmizrak;

import java.util.Scanner;

public class SuperNums {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a number");
		int number=scan.nextInt();
		int temp=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				temp+=i;
			}
		}
		
		if(temp==number) {
			System.out.println(temp+" is a super number");
		}else System.out.println(temp+" is NOT a super number");
		
		
		
		
		
		
	}
	
}
