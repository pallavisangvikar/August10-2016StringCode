package edu.wbqa.mock;

import java.util.Scanner;

public class ReverseStringWords {
	
	public static void reverseWordM1(String orgStr){
		
		System.out.println("\nReverse Words of String Method 1 by using Split method.");
		 //String revStr = "";
	      
	      
	      String[] original = orgStr.split(" ");
	      
	      System.out.println("The reversed string is : ");
			for(int i=original.length-1; i>=0; i--){
				System.out.print(original[i]+" "); 
			}
	      
	}
	
	public static void reverseWordM2(String orgStr){
		
		System.out.println("\nReverse Words of String Method 2 by using String builder and if.");
		 StringBuilder revStr = new StringBuilder("");
		    int end = orgStr.length(); // substring takes the end index -1
		    int counter = orgStr.length()-1;
		    for (int i = orgStr.length()-1; i >= 0; i--) {     
		        if (orgStr.charAt(i) == ' ' || i == 0) {
		            if (i != 0) {
		            	revStr.append(orgStr.substring(i+1, end));
		            	revStr.append(" ");
		            }
		            else {
		            	revStr.append(orgStr.substring(i,end));
		            }
		            end = counter;
		        }
		        counter--;
		    }
	      
		    System.out.println("The reversed string is : \n"+revStr);
	}
	
	


	public static void main(String[] args) {
		String orgStr;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse :");
		orgStr = in.nextLine();
		
		reverseWordM1(orgStr);
		reverseWordM2(orgStr);

	}

}
