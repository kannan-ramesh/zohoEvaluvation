package com.kannanrameshrk;

import java.util.Arrays;
import java.util.Scanner;

public class PatternZigzag {

	public static void main(String[] args) {
		//ZOHOISHIRING
		
		Scanner input = new Scanner(System.in);
		System.out.println("ENter the String:");
		
		String str = input.next();
		System.out.println("Enter the number of rows:");
		int row = input.nextInt();
		
		zigzagPattern(str, row);
		
	}

	private static void zigzagPattern(String str, int n) {
		int row = 0, col = 0;
		boolean flag = true;
		int len = str.length();
		
		char[][] arr = new char[4][len];
		
		for (int i = 0; i < str.length(); i++) {
			arr[row][col] = str.charAt(i);
			
			if (flag) {
				row++;
			} else {
				row--;
				col++;
			}
			if (row == n - 1) {
				flag = false;
			} else if (row == 0) {
				flag = true;
			}
		}
		display(arr);
		
	}

	private static void display(char[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != '\0') {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
