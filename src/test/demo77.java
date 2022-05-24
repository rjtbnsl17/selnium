package test;

public class demo77 {
	
	public static void main(String[] args) {
		
		int a = 1234;
		//String str="1234";
		int sum=0;
		int temp=a;
		
		while (a!=0) {
			
			int div= a%10;
			sum = (sum*10)+div; 
			a=a/10;
			
		}
			
		System.out.println(sum);
		
		if(sum == temp) {
			
			System.out.println("number is Pallindrome");
		}else {
		System.out.println("number is not pallindrome");
		}
		
	
	}

}
