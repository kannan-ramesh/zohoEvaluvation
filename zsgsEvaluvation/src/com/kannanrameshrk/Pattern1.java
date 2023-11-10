package com.kannanrameshrk;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);
		 
		 System.out.println("Enter the number");
		 int n = input.nextInt();
		 int j=0;
		 int count=0;
		 int len = n*n;
		 
		 
		 for(int i=0;i<n; i++) {
			 for(int k=i;k>0;k--) {
				 System.out.print("0");
				 count++;
			 }
			
			
			 System.out.println();
		 }
		 System.out.println(count+"remain"+(len-count));	
	}

}
