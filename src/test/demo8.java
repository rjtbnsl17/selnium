package test;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class demo8 {
	
	public static void main(String[] args) {
		String str = "raja$$$t";
		String str1 ="";
		String str2 ="";
		
		for(int i = str.length()-1;i>=0;i--) {
			
			if(str.charAt(i)=='$') {
				//str1=str1+str.charAt(i);
				str2=str2 +str.charAt(i);
				
				
			}else {
				str1=str1+str.charAt(i);
				
			}
			
		}
		System.out.println(str1);
	}
	
	
	
  
}
