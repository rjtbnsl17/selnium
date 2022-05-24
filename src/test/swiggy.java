package test;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;

public class swiggy {

	public static void main(String[] args) {

		List<String> lstr = new ArrayList<>();

		String dummy = "Cost for two: 300";

		int addvalue = 50;
		int reverse = 0;

		String[] str = dummy.split(" ");

		// System.out.println("value of amount :" + str.length);
		int n = str.length;

		for (int i = 1; i < n; i++) {

			lstr.add(str[i]);
			
		}

		System.out.println("value of amount : " + lstr.get(lstr.size() - 1));

		String sum = (String) lstr.get(lstr.size() - 1);

		int value = Integer.parseInt(sum);

		addvalue += value;

		System.out.println("result : " + addvalue);

		while (addvalue != 0) {

			int reminder = addvalue % 10;

			reverse = reverse * 10 + reminder;
			addvalue = addvalue / 10;

		}
		System.out.println("reverse number is : " + reverse);

	}

}
