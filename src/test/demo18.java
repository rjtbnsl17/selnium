package test;

import java.util.HashMap;

public class demo18 {

	public static void main(String[] args) {

		String str = "abcdefghabcdefgabcdef";

		// String[] s1 = str.split("h");

		String[] s2 = new String[100];

//		String s3 = "";

		// System.out.println(s1[1]);

		for (int j = 0; j < str.length(); j++) {
			s2[j]="";

			for (int i = j; i <3 + j; i++) {

				if (i == 3 + j) {
					break;
				}
				s2[j] = s2[j] + str.charAt(i);

			}
			System.out.println(s2[j]);

		}

		HashMap<String, Integer> m1 = new HashMap<>();

		Integer value;
		
		System.out.println(s2.length);

		
		  for (int i = 0; i < s2.length; i++) {
		  
		  value = m1.get(s2[i]);
		  
		  if (value == null) {
		  
		  m1.put(s2[i], 1);
		  
		  } else {
		  
		  m1.put(s2[i], value + 1); }
		  
		  }
		  
		  System.out.println(m1);
		 

	}

}
