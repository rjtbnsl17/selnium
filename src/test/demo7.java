package test;

import org.openqa.selenium.json.StaticInitializerCoercer;

public class demo7 {

	public static void main(String[] args) {

		String str = "a@uto$mat*ion";  
		char []c1 = str.toCharArray();
		String rev = "";
		char[] c = new char[str.length()]; 

		int n = c1.length; 
		


		System.out.println(n);

		for (int i = 0; i < n; i++) {

			
			if (c1[i] == '@') {

				c[i] = '@';
 
			} else if (c1[i] == '$') {

				c[i] = '$';

			} else if (c1[i] == '*') {
				c[i] = '*';
			}

			int k = n-1;

			
			  for (int j = 0; j < n; i++) {
			  
			  if (c1[j] == '@' || c1[j] == '$' || c1[j] == '*') {
			  k--;
			  
			  }
			  
			  c[k] = c1[j];
			  k--;
			  System.out.print(c);
			  
			  }
			 

		}

	}

}
