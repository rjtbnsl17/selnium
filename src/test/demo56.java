package test;

import java.util.HashMap;
import java.util.Map;

public class demo56 {

	
	public static void main(String[] args) {
		
		String str = "google";
		
		char[] c1 = str.toCharArray();
		
		HashMap<Character, Integer> m1 = new HashMap<>();
		
		Integer value;
		
		for(int i=0;i<c1.length;i++) {
			
			value = m1.get(c1[i]);
			
			if(value==null) {
				m1.put(c1[i], 1);
				
			}else {
				m1.put(c1[i], value +1);
			}
			
		}
		
		
		for(Map.Entry<Character, Integer> mEntry : m1.entrySet()) {
			
			if(mEntry.getValue()>1) {
				System.out.println(mEntry.getKey());
				
			}
			
		}
	}
}
