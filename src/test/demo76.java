package test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class demo76 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 4, 3, 4, 5, 2, 2 ,4};

		int min = arr[0];
		int minj;

		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();

		int[] dist = new int[arr.length];
		
		

		for (int i = 1; i < arr.length; i++) {

			if (min >= arr[i]) { 

				min = arr[i];

				

			}

		}
		
		for (int i = 0; i < arr.length; i++) {

			if ( arr[i]==min) { 

				

				dist[i] = i;
				System.out.println(dist[i]);

			}

		}

		for (int i = 0; i < dist.length; i++) {

			if (dist[i] > 0) {

				l1.add(dist[i]);

			}
		}

		System.out.println(l1);

		for (int i = 0; i < l1.size(); i++) {

			while (i < l1.size() - 1) {

				l2.add(l1.get(i + 1) - l1.get(i));
				i++;

			}
		}

		System.out.println(l2);

		minj = l2.get(0);
		for (int i = 1; i < l2.size(); i++) {

			if (minj > l2.get(i)) {

				minj = l2.get(i);
			}

		}

		System.out.println(minj);

	}
}
