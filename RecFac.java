package com.hamitmizrak;

public class RecFac {
	
	public static void main(String[] args) {
		
		System.out.println(factor(6));
		
		
	}
	
	public static int factor(int number) {
		if(number==1) {
			return 1;
		}
		if(number==0) {
			return 1;
		}
	
		return number*factor(number-1);
	}
	
}
