package test;

public class gyi {
	public static  int i=0;
	public static void main(String[] args) {
		
	
		loop();
		
		
	}
	
	public static void loop() {
		
		if(i<100) {
		System.out.println(100-i++);
		
		loop();
		}
		
	}

}
