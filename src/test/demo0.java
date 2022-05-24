package test;

import java.util.ArrayList;
import java.util.List;

public class demo0 {
	public static void main(String [] args){
		

		int[] arr =  {1,0,1,0,0,1,1};

		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();

		for(int i=0; i<arr.length;i++){
			
			if(arr[i]==1){

			l1.add(arr[i]);

			}else

			l2.add(arr[i]);



		}

		l1.addAll(l2);

		System.out.println(l1);


		}

}
