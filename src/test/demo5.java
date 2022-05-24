package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo5 {

	public static void main(String[] args) {

		String input = "{red{gree}yellow{blue}}";
		functions(input, 3);

		// input 1 = {red{green}yellow{blue}}
		// input 2 = {green}
		// input 3 = {blue}

	}

	public static void functions(String input, int t) {

		// String str = "Welcome to {Stack{How}To}";

		
		if (t == 3) {
			Matcher m = Pattern.compile("\\{[a-z][a-z][a-z][a-z]\\}").matcher(input);
			// String res = str.substring(str.indexOf("{")+1,str.indexOf("}"));
			// System.out.println(res);

			while (m.find()) {
				System.out.println(m.group(0));
			}
		}else if(t==1)
		{
			Matcher m = Pattern.compile("\\{[a-z]+\\{[a-z]+\\}[a-z]+\\{[a-z]+\\}\\}").matcher(input);
		
		

		while (m.find()) {
			System.out.println(m.group(0));
		}
	}

}
}
