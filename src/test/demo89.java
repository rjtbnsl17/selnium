package test;

import com.sun.net.httpserver.Authenticator.Result;

public class demo89 {

	public static void main(String[] args) {

		String arr = "23"; // 9 7

		String s1 = "23";

		char c = '0';
		String add = "";
		int a = 0;
		int result = 0;

		String output = "";

		for (int i = arr.length() - 1; i >= 0; i--) {

			int k = (int) arr.charAt(i) - c;
			int j = (int) s1.charAt(i) - c;

			//System.out.println(k);
			//System.out.println(j);

			result = k + j + a; // 9+9+1
			
			//System.out.print(result);

			// output =result+output;

			while (result != 0 && result >= 10) { // 19

				add = String.valueOf(result % 10); // 9

				output = add + output; // 89
				result = result / 10;

				a = result;

			}

		}
		
		if(result==0) {
			
			System.out.print(output);
		}else {
			output = String.valueOf(result) + output;
		}
		
		
		

	}

}
