package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dem17 {

// arr ={1,2,3,4,5}
	// r = 2
	// {5,1,2,3,4}
	// {4,5,1,2,3}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int r = 0;
		

		List<Integer> l1 = new ArrayList<>();

		List<Integer> l2 = new ArrayList<>();

		for (int j = 0; j < arr.length; j++) {

			l2.add(arr[j]);

		}

		System.out.println(l2);

		for (int k = 1; k <= r; k++) {

			l1.add(l2.get(l2.size() - 1));

			for (int i = 0; i < l2.size() - 1; i++) {

				l1.add(l2.get(i)); // 0 1 2 3 1 2 3 4

			}

			System.out.println(l1);

			l2.clear();

			l2.addAll(l1);
			l1.clear();

		}

	}
}
