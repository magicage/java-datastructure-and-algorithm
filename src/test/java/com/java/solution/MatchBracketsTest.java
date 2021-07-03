package com.java.solution;

import org.junit.Test;

public class MatchBracketsTest {

	@Test
	public void isValidTest() {
		
		MatchBrackets m = new MatchBrackets();
		System.out.println(m.isValid("()[]{}"));
		System.out.println(m.isValid("([)]{}"));
	}

}
