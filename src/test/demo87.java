package test;

import java.util.Stack;

public class demo87 {

	// String str = "{()}]"

	public static void main(String[] args) {
		String str = "{()}]";

		if (balanced(str) == false) {
			System.out.println("Not balncing string");
		} else {
			System.out.println("balancing string");
		}
	}

	public static boolean balanced(String str) {

		Stack<Character> s1 = new Stack<>();
		char c;

		for (int i = 0; i < str.length(); i++) {

			c = str.charAt(i); // {
			// {
			if (c == '(' || c == '{' || c == '[') {
				s1.push(c);
				continue;
			}
			
			char x;

			switch (c) { // {
			case '}': {
				if (c == '(' || c == '[') { //
					s1.pop();
					return false;
					

				}

			}
			case ')': {
				if (c == '{' || c == '[') {
					s1.pop();
					return false;
					

				}

			}
			case ']': {
				if (c == '{' || c == '(') {
					s1.pop();
					return false;
					

				}

			}

			}

		}
		if (s1.isEmpty()) 

			return false;
		
return true;
	}
}
