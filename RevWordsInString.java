package edu.wbqa.mock;

import java.util.ArrayList;
import java.util.Scanner;

public class RevWordsInString {
	
	public static void revWordsInStringM1(String orgStr){
		
		System.out.println("\nReverse Words in String Method 1 by using split method.");
		
		String[] strArr = orgStr.split(" ");
		
		for(int i=0; i<strArr.length; i++){
			
			char[] str1Arr = strArr[i].toCharArray();
			strArr[i] ="";
			for(int j=str1Arr.length-1; j>=0; j--){
				strArr[i] = strArr[i]+str1Arr[j];
			}
		}
		
		System.out.println("The reversed string is : ");
		for(String revStr:strArr){
			System.out.print(revStr+" ");
		}
				
	}
	
	public static void revWordsInStringM2(String orgStr){
				
		System.out.println("\nReverse Words of String Method 2 by using String builder and ArrayList.");
		ArrayList<String> arr = new ArrayList<String>();
		StringBuilder revStr = new StringBuilder("");
		for (int i = 0; i < orgStr.length(); i++){
			char at = orgStr.charAt(i);
			if(at == ' ' ){
				arr.add(revStr.toString());
				revStr.setLength(0);
			 }
			else{
				revStr.append(at);
			}
		 }
		arr.add(revStr.toString());
		System.out.println("The reversed string is : ");
		for(int i = 0; i < arr.size(); i++){
			String word = arr.get(i);
			for(int j = word.length()-1; j >= 0; j-- ){
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}
		
	}
	
	

	public static void main(String[] args) {
		String orgStr;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse :");
		orgStr = in.nextLine();
		
		revWordsInStringM1(orgStr);
		revWordsInStringM2(orgStr);

		

	}

}
