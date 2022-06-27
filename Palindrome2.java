package com.hamitmizrak;

import java.util.Scanner;

public class Palindrome2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a word ");
		String str=scan.nextLine();
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
			
		}
		System.out.println("Reverse of input: "+temp);
		if(str.equals(temp)) {
			System.out.println("True");
			
		}else {System.out.println("false");}
		
		
		
		
	}
	
}
