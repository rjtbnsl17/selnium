package test;

import java.util.HashMap;

public class demo78 {

	public static void main(String[] args) {

		String str = "aabbbaab";
		int count;

		for (int i = 0; i < str.length(); i++) {

			count = 1;

			while ((i + 1 < str.length()) && (str.charAt(i) == str.charAt(i + 1))) { // 1<5 && a ==b

				i++;
				count++; // 1
			}

			System.out.print(str.charAt(i) + "" + count);
		}

	}

}
