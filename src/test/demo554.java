package test;

import java.util.HashMap;
import java.util.Map;



public class demo554 {

	// int [] arr = {1,5,4,3,1,0,5,8,3};

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 3, 1, 0, 5, 8, 3 };

		HashMap<Integer, Integer> map = new HashMap<>();

		Integer value;
		
		for(int i=0;i<arr.length;i++) {
			
			  value=map.get(arr[i]);
			  
			  if(value==null) {
				  
				  map.put(arr[i], 1);
			  }else {
				map.put(arr[i], value+1);
			}
			
			
		}
		
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			
			if(m.getValue()==2) {
				
				System.out.println(m.getKey());
				
			}
		}

	}

}
