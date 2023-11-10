package com.kannanrameshrk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumbledNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = input.nextInt();
		
		System.out.println(n);
		
		if(jumpNumber(n)) {
			System.out.println(n +" is a jumbled number");
		}else {
			System.out.println(n +" is not a jumbled number");
		}

	}

	private static boolean jumpNumber(int n) {
		List<Integer> arr = new ArrayList<>();
		
		int temp = 0;
		
		while(n != 0 ) {
			temp = n%10;
			arr.add(temp);
			n = n/10;
		}
		
		for(int i=0; i<arr.size()-1; i++) {
			int different = Math.abs(arr.get(i+1) - arr.get(i));
			
			if(different != 1) {
				return false;
			}
		}
		return true;
	}

}
