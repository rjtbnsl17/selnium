package test;

import java.util.HashMap;
import java.util.Stack;

import org.checkerframework.checker.units.qual.s;

public class demo88 {
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,10,20,50,40};
		
		int [] days = new int[arr.length];
		Stack<Integer> s1 = new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			
			while(!s1.isEmpty() && (s1.peek() < arr[i])) {
				
				days[s1.peek()] = arr[0]-s1.peek();
				System.out.println(s1.peek());
				s1.pop();
				
			}
			s1.push(i);
			
			
			
		}
		for(int i=0;i<arr.length;i++) {
		
		System.out.print(days[i]);
		}
	}
	/*
	 * HashMap<Integer, Integer> m1 = new HashMap<>(); Integer value ;
	 * 
	 * for(int i=0; i<arr.length;i++) {
	 * 
	 * value = m1.get(arr[i]);
	 * 
	 * if(value==null) {
	 * 
	 * m1.put(arr[i], 1);
	 * 
	 * }else { m1.put(arr[i], value+1); } }
	 * 
	 * System.out.println(m1)
	 */;
		}


