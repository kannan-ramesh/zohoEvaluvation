package com.kannanrameshrk;

import java.util.Scanner;

public class lexicographically {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of string entered=");
		int n = input.nextInt();
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the String"+ (i+1) +":");
			arr[i] = input.next();
		}
		
		lexicoString(arr);
		
		System.out.println("Output");
		//sort array element length wise
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length; j++) {
				if(arr[i].length() < arr[j].length()) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//Arrays.sort(arr);
		//print String
		//int j=0;
		for(int i=0;i<arr.length; i++) {
			System.out.println("String"+ (i+1) +":" + arr[i].toString());
		}
		

	}

	private static void lexicoString(String[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sorting(arr[i]);
			//System.out.println("hi"+ arr[i]);
		}
	}

	private static String sorting(String str) {
		//string store in character array
		 char[] charArray = str.toCharArray();
		 //sorting element
		    for (int i = 0; i < charArray.length; i++) {
		        for (int j = i + 1; j < charArray.length; j++) {
		        	//System.out.println(charArray[i]);
		        	System.out.println(Character.toUpperCase(charArray[i]));
		        	  if (Character.toUpperCase(charArray[i]) <= Character.toUpperCase(charArray[j])) {
		                      char temp = charArray[j];
		                      charArray[j] = charArray[i];
		                      charArray[i] = temp;
		                  }
		        }
		    }
		   return  new String(charArray);
	}
}