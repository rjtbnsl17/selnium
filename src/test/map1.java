package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.Module.SetupContext;

public class map1 {
	
	
	public static void main(String[] args) {
		
		int []arr = {10,12,10,12,3,10};
		
		HashMap<Integer,Integer> m1 = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			// value = m1.get(arr[i]);
			if(m1.get(arr[i]) == null) {
				m1.put(arr[i], 1);
				
			}else {
				
				m1.put(arr[i], m1.get(arr[i])+1);
				
			}
			
		}
		System.out.println(m1);
		
		
			
	/*	for(	Map.Entry<Integer, Integer> m : m1.entrySet()) {
			
	if(m.getValue()==1) {
		
		System.out.println(m.getKey());
		
	}*/
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(m1.get(arr[i])==1) {
				
				System.out.println(arr[i]);
				
			}
			
			
		}
		
			
		
		
		
				
			}
			
		}	
		
	
	


