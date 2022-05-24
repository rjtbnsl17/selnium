/*Given an array arr[] of n integers, construct a Product Array prod[] 
(of same size) such that prod[i] is equal to the product of all the \
elements of arr[] except arr[i]. Solve it without division operator in O(n) time.*/

package test;

import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

//import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;
//import sun.jvm.hotspot.oops.ReturnTypeEntry;

public class interview {

	public static String products() {

		int arr[] = { 10, 2, 3, 4, 5 };
		// int result = 1;
	//	int dummy;

		int result[] = new int[5]  ;
		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {

				result[i] = arr[i +1] * arr[i + 2] * arr[i + 3] * arr[i + 4];
				System.out.println("result["+i+"] = "+result[i]);

			} else if (i == 1) {
				result[i] = arr[i - 1] * arr[i + 1] * arr[i + 2] * arr[i + 3];
				System.out.println("result["+i+"] = "+result[i]);
			} else if (i == 2) {
				result[i] = arr[i - 2] * arr[i - 1] * arr[i + 1] * arr[i + 2];
				System.out.println("result["+i+"] = "+result[i]);
			} else if (i == 3) {
				result[i] = arr[i - 3] * arr[i - 2] * arr[i - 1] * arr[i + 1];
				System.out.println("result["+i+"] = "+result[i]);
			} else if (i == 4) {
				result[i] = arr[i - 4] * arr[i - 3] * arr[i - 2] * arr[i - 1];
				System.out.println("result["+i+"] = "+result[i]);
			}
		

		}
		//System.out.println(Arrays.toString(result));
		return Arrays.toString(result);
	}

	public static void main(String[] args) {
		String prod = null;
		prod = products();
		System.out.println(prod);
	}

}
