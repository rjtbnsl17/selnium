package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

public class Demo {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 5, 3, 0,1,-8 };
		// passingArrray(arr);
		Set<Integer> s = new LinkedHashSet<>();
		List<Integer> l = new ArrayList<>();

		l = passingArray(arr);
		s = unique(arr);
		System.out.println("sorted listed" + l);
		System.out.println("unique value of array" + s);
		

	}

	public static List<Integer> passingArray(int[] ar) {

		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == 0 || ar[i] == 1) {

				l1.add(ar[i]);

			} else if (ar[i] != 0 && ar[i] != 1) {
				
				l2.add(ar[i]);

			}

		}
		l1.addAll(l2);
		return l1;

	}

	public static Set<Integer> unique(int[] ar) {

		Set<Integer> s1 = new LinkedHashSet<>();

		for (int i = 0; i < ar.length; i++) {

			s1.add(ar[i]);

		}

		return s1;
	}

}
