package test;

import java.util.HashMap;

public class demo31 {

	public static void main(String[] args) {

		String input = "hAKUNAhMATATAH";

		input = input.toLowerCase();

		char[] c1 = input.toCharArray(); // H

		HashMap<Character, Integer> m1 = new HashMap<>();
		Integer value;

		for (int i = 0; i < c1.length; i++) {

			value = m1.get(c1[i]); // H

			if (value == null) {
				m1.put(c1[i], 1); // H=1

			} else {

				m1.put(c1[i], value + 1);

			}

		}

		System.out.println(m1);

	}

}
