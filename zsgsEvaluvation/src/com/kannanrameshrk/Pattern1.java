package com.kannanrameshrk;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        
        int[][] arr = new int[n][n];
        
        int number=1;
        
        int top=0,bottom=n-1;
        int left=0,right=n-1;
       
        int len =n*(n+1)/2;
        
        while(number<= len){
        	//print top to bottom
            for(int i=top;i<=bottom;i++){
                arr[i][left]=number++;
                //System.out.print(i+","+left+"-");
            
            }
            
            left++;bottom--;
            //print bottom to top cross
            for(int i=bottom;i>=top;i--){
                arr[i][right]=number++;
               // System.out.println(i+","+right);
        
            }
            right--;
            //print right to left
            for(int i=right;i>=left;i--){
                arr[top][i]=number++;
               
            }
            top++;bottom--;
        }

        for(int i=0;i<n;i++){
        	//print space
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }

            for(int j=0;j<n;j++){
                if(arr[i][j]==0) {
                    continue;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
}
