package test;

public class Demo4 {

	// I am a book
	// k oo b amai 

	public static void main(String[] args) {

		String book = "i am a book";
		String str1 = "";
		String str2 = "";

//	String str[] =  book.split(" ");

		int n = book.length();

		for (int i = n - 1; i >= 0; i--) {

			char ch = book.charAt(i);

			str1 += ch;

		}

		System.out.println(str1);

		str1=str1.replaceAll(" ", "");
		System.out.println(str1);
		for(int i = 0 ; i<str1.length();i++) {
			
			
		}
		System.out.println(str2);	
	}
}
