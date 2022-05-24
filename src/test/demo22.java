package test;

import java.util.HashMap;

import org.apache.commons.io.FileUtils;

public class demo22 {

	public static void main(String[] args) {

		String input = "Google News is a news aggregator service developed by Google. It presents a continuous flow of links to articles organized from thousands of publishers and magazines. Google News is available as an app on Android, iOS, and the Web. Google released a beta version in September 2002 and the official app in January 2006.";

	input =	input.replaceAll("[.@]", "");
		String[] str = input.split(" ");
		Integer value;

		HashMap<String, Integer> m1 = new HashMap<>();

		for (int i = 0; i < str.length; i++) {

			value = m1.get(str[i]);

			if (value == null) {

				m1.put(str[i], 1); //google =1
			} else {
				
				m1.put(str[i], value + 1); //
			}

		}

		System.out.println(m1);
	}

}
