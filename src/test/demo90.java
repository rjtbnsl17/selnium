package test;

import java.util.ArrayList;
import java.util.List;

public class demo90 {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 19, 7, 6, 17, 12 };

		List<Integer> l1 = new ArrayList<>();

		int max=0;

		for (int i = 0; i < arr.length-1; i++) { 
			for (int j = i + 1; j < arr.length-1; j++) {

				if (arr[i] < arr[j]) { //3<2  //3<19 //2<19 //19

					max = arr[j];
					l1.add(max); //19 //19
					break;

				} else  {
					
					l1.add(arr[i]);
				//	break;
					
				}
				

			}
		}

		 System.out.println(l1);

	}

}
