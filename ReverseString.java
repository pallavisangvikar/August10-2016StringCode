package edu.wbqa.mock;

import java.io.BufferedReader;
import java.util.Scanner;

public class ReverseString {
	
	public static void reverseMethod1(String orgStr){
		
		System.out.println("Reverse String Method 1 by using the lenth of string and printing in reverse.");
		String revStr = "";
		
		for ( int i = orgStr.length() - 1 ; i >= 0 ; i-- )
			
			revStr = revStr + orgStr.charAt(i);
		
		System.out.println("Reverse of entered string is : \n"+revStr);
	}
	
	
	public static void reverseMethod2(String orgStr){
		System.out.println("Reverse String Method 2 by using the String Buffer and inbuilt reverse method.");
		String revStr = "";
		
		StringBuffer a = new StringBuffer(orgStr);
		revStr = a.reverse().toString();
		
		System.out.println("Reverse of entered string is : \n"+revStr);

	}
	

	public static void main(String[] args) {
		
		String orgStr;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse :");
		orgStr = in.nextLine();
		
		reverseMethod1(orgStr);
		reverseMethod2(orgStr);
		

	}

}
