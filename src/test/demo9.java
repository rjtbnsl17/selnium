package test;

import java.util.Arrays;

public class demo9 {

	public static void main(String[] args) {
		int temp = 0;
		int arr[] = { 109, 501, 607 };
		
		// sort w.r.t last digit = 501,607,109
		
		// string str = "raja$$$t"
		
		// string result = "taja$$$r"
		
		
		int last[] = new int[arr.length];
		int a[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			last[i] = arr[i] % 10; // 7

		}

		System.out.println(Arrays.toString(last)); // 7

		int def = last[0];
		int min = arr[0];

		for (int i = 0; i < last.length; i++) {

			for(int j=i+1;j<last.length;j++) {
				int tmp = 0;  
				if(last[i]>last[j]) {
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp; 
					
				}
			}
		}System.out.println(Arrays.toString(arr));
		
	}

}
