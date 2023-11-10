package com.kannanrameshrk;

import java.util.Scanner;
import java.util.Stack;

public class MathematicalExpression {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENter Expression:");
		String exp = input.next();
		
		System.out.println(exp);
		
		if(validExpression(exp)) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}

	}

	private static boolean validExpression(String exp) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<exp.length(); i++) {
			char c = exp.charAt(i);
			
			if(c == '(' || c == 'a' || c == '+' || c == '*') {
				stack.push(c);
			}else if(c == 'b') {
				if(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '+') ) {
					stack.pop();
					stack.pop();
				}else {
					return false;
				}
			}else if(c == ')') {
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

}
