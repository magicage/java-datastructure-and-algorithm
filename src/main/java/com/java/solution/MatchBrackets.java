package com.java.solution;

import com.java.datastructure.ArrayStack;
import com.java.datastructure.Stack;

public class MatchBrackets {

	public boolean isValid(String s) {
		
		Stack<Character> stack = new ArrayStack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char topChar = stack.pop();
				if (c == ')' && topChar != '(') {
					return false;
				}
				if (c == ']' && topChar != '[') {
					return false;
				}
				if (c == '}' && topChar != '{') {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
}
