package test;
import java.util.Scanner;
public class multiply {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int prod = 1, i, j = 0;
	      //  System.out.println("How many values do you want to enter");
	      //  int n = sc.nextInt();
	        int a[] = {1,2,3,4,5,6};
	      
	        int a2[] = new int[a.length];
	     //   System.out.println("Input " + n + " values:");
	       
	        for (i = 0; i < a.length; i++) {
	            inner:
	            while (j < a.length) {
	                if (a[j] == a[i]) {
	                    j++;
	                    continue inner;
	                }
	                prod *= a[j];
	            }
	            a2[i] = prod;
	            System.out.println(a2[i]);
	        }
	    }
	}


